# React Native Keychain

## 關於分支管理

### Main 分支
- **main** 分支表示我們 repo 追蹤的主要分支
- 我們自己的最新改動都合併至 main 分支

### Master 分支
- **master** 分支表示 upstream 追蹤的主要分支
- 可以在 Github 的介面找到 **Sync fork** 按鈕
- 點擊 **discard {n} commits** 來同步 upstream

## 建置專案

1. **Clone 專案**
   ```bash
   git clone https://github.com/CoolBitX-Technology/react-native-keychain.git
   ```

2. **檢查 Yarn 版本**
   ```bash
   yarn -v
   ```
   > 確保 yarn 版本和 `package.json` 內指定的相同

3. **安裝依賴**
   ```bash
   yarn install
   ```

4. **部署至 npm（可選）**
   
   如果有相關改動需要發布：
   ```bash
   yarn run deploy
   ```
   > ⚠️ **注意**: 需要登入 npm。登入資料可以在 1Password 查看。

## 在本地 App 專案進行測試

1. **複製本地路徑**
   
   複製本地 react-native-keychain 的路徑，例如：
   ```
   /Users/kimlai/react-native-keychain
   ```

2. **更新 package.json**
   
   將路徑貼到 app 專案的 `package.json`：
   ```json
   {
     "dependencies": {
       "react-native-keychain": "/Users/kimlai/react-native-keychain"
     }
   }
   ```

3. **安裝依賴**
   ```bash
   yarn install
   ```

4. **開啟 App 進行測試**
   
   完成設定後即可開啟 App 進行測試
