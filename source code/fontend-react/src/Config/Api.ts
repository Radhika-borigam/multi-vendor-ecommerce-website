import axios from 'axios';

export const API_URL = process.env.REACT_APP_API_URL || "http://localhost:5454";
export const DEPLOYED_URL = API_URL; // Use local URL for development

export const api = axios.create({
  baseURL: process.env.NODE_ENV === 'production' ? DEPLOYED_URL : API_URL,
  headers: {
    'Content-Type': 'application/json',
  },
  withCredentials: true
});

// Add a request interceptor
api.interceptors.request.use(
  (config) => {
    const token = localStorage.getItem('jwt');
    if (token) {
      config.headers.Authorization = `Bearer ${token}`;
    }
    return config;
  },
  (error) => {
    return Promise.reject(error);
  }
);

export const uploadToCloudinary = async (pics:any) => {
    const cloud_name="dxoqwusir"
    // ...for image uploads
}