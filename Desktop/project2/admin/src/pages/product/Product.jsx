import "./product.css"
import {Link} from "react-router-dom";
import Chart from "../../component/chart/Chart";
import {productData} from "../../dummyData";
import {Publish} from "@material-ui/icons"

export default function Product() {
    return (
        <div className="product">
            <div className="productTitleContainer">
              <h2 className="productTitle">Product</h2>
              <Link to="/newProduct">
               <button className="productAddButton">Create</button>
               </Link>
            </div>
            <div className="productTop">
              <div className="productTopLeft">
               <Chart data={productData} dataKey="Sales" title="Sales Proformance"/>
              </div>
              <div className="productTopRight">
                <div className="productInfoTop">
                    <img src="https://images.unsplash.com/photo-1610438235354-a6ae5528385c?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YXBwbGUlMjBhaXJwb2RzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80"
                     alt="" className="productInfoImg" />
                     <span className="productInfoName">Apple Airpods</span>
                </div>
                 <div className="productInfoBotton">
                    <div className="productInfoItems">
                      <span className="productInfoKey" >id:</span>
                      <span className="productInfoValue" >123</span>
                    </div>
                    <div className="productInfoItems">
                      <span className="productInfoKey" >Sales:</span>
                      <span className="productInfoValue" >5123</span>
                    </div>
                    <div className="productInfoItems">
                      <span className="productInfoKey" >Active:</span>
                      <span className="productInfoValue" >yes</span>
                    </div>
                    <div className="productInfoItems">
                      <span className="productInfoKey" >In Stock:</span>
                      <span className="productInfoValue" >no</span>
                    </div>
                 </div>
              </div>
            </div>
             <div className="productBottom">
                <form className="productForm">
                 <div className="productFormLeft">
                   <label>Product Name</label>
                   <input type="text" placeholder="Apple Airpods"/>
                    <label>In Stock</label>
                    <select name="InStock" id="InStock">
                       <option value="yes">yes</option>
                       <option value="no">no</option>
                    </select>
                    <label>Active</label>
                    <select name="active" id="active">
                       <option value="yes">yes</option>
                       <option value="no">no</option>
                    </select>
                 </div>
                <div className="productFormRight">
                  <div className="productUpload">
                     <img src="https://images.unsplash.com/photo-1610438235354-a6ae5528385c?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YXBwbGUlMjBhaXJwb2RzfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80" 
                     alt="" className="productUploadImg"/>
                     <label for="file">
                      <Publish/>
                     </label>
                     <input type="file" id="file" style={{display: "none"}}/>
                  </div>
                  <button className="productBotton">Update</button>
                </div>
                </form>
             </div>
        </div>
    )
}
