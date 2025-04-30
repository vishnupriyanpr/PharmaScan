# 💊 **PHARMASCAN**  
## Medicine Strip Scanner 📸🤖 – Redefining Medicine Identification  

**MediScan** is an AI-powered Android application that simplifies medicine recognition by scanning blister strips using Google’s Gemini. It empowers users to understand their medications instantly—just by snapping a photo. 🧠📱  

It bridges AI and healthcare in a simple, accessible, and powerful way for everyone—patients, pharmacists, and healthcare workers alike.

---

## 🚀 **Key Features**

### 🧠 **AI Medicine Strip Recognition** (via Gemini)  
📸 Capture or upload an image of any medicine strip.  
🔍 Google Gemini processes the image and identifies the medicine with a detailed explanation.  


### 📋 **No Manual Input Required**  
💡 Skip typing medicine names—ideal for users with spelling uncertainty or unlabeled tablets.  
⚠️ Eliminates errors due to similar drug names or wrong dosage info.


### 🌐 **Real-Time AI Integration**  
🤖 Built with Google’s Generative AI SDK.  
⚡ Provides instant insights and usage instructions based on scanned images.


### 🎨 **Clean, Modern UI**  
📱 Intuitive and elegant design focused on accessibility.  
🧭 Streamlined workflow for non-tech-savvy users.


### 🔒 **Data Privacy & Local Control**  
🛡️ No unnecessary data storage.  
🚫 All recognition is handled securely with user consent, preserving privacy.


---

## 🔧 **Tech Stack**

- 📲 **Android** (Kotlin/Jetpack Compose)  
- 🔥 **Firebase** (Authentication & Storage)  
- 🤖 **Google Gemini** Generative AI  
- 📷 **CameraX** / Image Picker  
- 📦 **Glide** (Image Loading)

---
## 🔑 **Set Up Your API Key**

To enable the **Generative AI** functionality in the app, you need to provide your custom API key. Follow these steps:
1. Open the file located at: app/src/main/java/com/example/pharmascan/GenerativeAiViewModelFactory.kt
2. In this file, locate the following code:

(
val generativeModel = GenerativeModel(

    modelName = "gemini-2.0-flash",
    
    apiKey = "PASTE YOUR API KEY HERE", // Replace with your actual Gemini 2.0 Flash API key
    
    generationConfig = config
)
)
![Screenshot_20250430_012531](https://github.com/user-attachments/assets/f9b8007c-12d0-4d39-9ca1-763bdb00392f)
![Screenshot_20250430_012517](https://github.com/user-attachments/assets/7b7ffa2b-8888-4b3e-aa58-31eadaacc3f9)
<p align="center">
  <img src="https://github.com/user-attachments/assets/f9b8007c-12d0-4d39-9ca1-763bdb00392f" alt="Screenshot 1" width="45%" />
  <img src="https://github.com/user-attachments/assets/7b7ffa2b-8888-4b3e-aa58-31eadaacc3f9" alt="Screenshot 2" width="45%" />
</p>


## 💡 **Why MediScan?**

Most existing apps rely on manual input or complex UI, which doesn’t help users with unlabeled medicines or visual-only access. **MediScan** solves this with a smart photo-based solution—quick, simple, and safe.

---

## 🌟 **Join Us!**

Be a part of a smarter healthcare future by making medicine info accessible to everyone with just a photo.  
Let’s make medication safety smarter—one scan at a time. 📸💊📈  

