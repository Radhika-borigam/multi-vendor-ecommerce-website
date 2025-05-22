import React from 'react'

const About = () => {
  return (
    <div className="min-h-screen py-10 px-4 lg:px-20">
      <h1 className="text-3xl font-semibold text-center mb-8">About Us</h1>
      
      <div className="max-w-4xl mx-auto space-y-6">
        <p className="text-lg">
          Welcome to Tillu Bazaar, your premier multi-vendor ecommerce marketplace.
          We connect buyers with trusted sellers to provide a diverse range of quality products.
        </p>

        <div className="bg-gray-50 p-6 rounded-lg">
          <h2 className="text-xl font-medium mb-4">Our Mission</h2>
          <p>
            To create a seamless online shopping experience where buyers can discover unique products
            and sellers can grow their businesses with powerful ecommerce tools.
          </p>
        </div>

        <div className="bg-gray-50 p-6 rounded-lg">
          <h2 className="text-xl font-medium mb-4">Why Choose Us?</h2>
          <ul className="list-disc pl-5 space-y-2">
            <li>Curated selection of quality products</li>
            <li>Secure payment processing</li>
            <li>Reliable shipping and delivery</li>
            <li>Excellent customer service</li>
            <li>Easy returns and refunds</li>
          </ul>
        </div>

        <div className="bg-gray-50 p-6 rounded-lg">
          <h2 className="text-xl font-medium mb-4">For Sellers</h2>
          <p>
            Join our platform to reach more customers and grow your business. We provide robust tools
            for inventory management, order processing, and analytics to help you succeed.
          </p>
        </div>
      </div>
    </div>
  )
}

export default About
