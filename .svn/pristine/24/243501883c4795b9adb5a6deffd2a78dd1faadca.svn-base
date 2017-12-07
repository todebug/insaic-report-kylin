// const serialize = require('serialize-javascript');
import moment from 'moment';

const utils = {
  version: 0.01,
  serialize: (obj) => Object.keys(obj).map(key => `${key}=${obj[key]}`).join('&'),
  ajax: type => (url, data) => new Promise((resolve, reject) => {
    let p = {};
    if (type === 'POST') {
      p = {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json;charset=UTF-8',
        },
        credentials: 'same-origin',
        body: JSON.stringify(Object.assign({}, data)),
      };
    }
    const rootUrl = `/insaic-report-kylin${url}`;
    const curl = type === 'GET' ? `${rootUrl}?${utils.serialize(Object({}, data))}` : rootUrl;
    fetch(curl, p).then(res => {
      if (res.status === 200) {
        res.json().then(json => {
          if (resolve) {
            resolve(json);
          } else {
            reject(json);
          }
        });
      } else if (res.status === 201) {
        res.blob().then(blob => {
          const a = document.createElement('a');
          const downloadUrl = window.URL.createObjectURL(blob);
          const filename = data;
          a.href = downloadUrl;
          a.download = filename;
          a.click();
          window.URL.revokeObjectURL(downloadUrl);
        });
      } else if (res.status === 202) {
        // 生成文件不存在处理
        resolve(res.status);
      }
    });
  }),
  data: (timestamp) => {
    if (!timestamp) return;
    const result = parseInt(timestamp, 10);
    moment(result).format('YYYY-MM-DD HH:mm:ss');
  },
  uuid() {
    return (((1 + Math.random()) * 0x10000) | 0).toString(16).substring(1);
  },
};
export default utils;
