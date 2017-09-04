package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.NodeEdge;

/**
 * InlineResponse2003In
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-04T08:23:56.671Z")
public class InlineResponse2003In {
  @SerializedName("5f9e769ff6fe4cee02b3b4547200db6b")
  private NodeEdge _5f9e769ff6fe4cee02b3b4547200db6b = null;

  public InlineResponse2003In _5f9e769ff6fe4cee02b3b4547200db6b(NodeEdge _5f9e769ff6fe4cee02b3b4547200db6b) {
    this._5f9e769ff6fe4cee02b3b4547200db6b = _5f9e769ff6fe4cee02b3b4547200db6b;
    return this;
  }

   /**
   * Get _5f9e769ff6fe4cee02b3b4547200db6b
   * @return _5f9e769ff6fe4cee02b3b4547200db6b
  **/
  @ApiModelProperty(required = true, value = "")
  public NodeEdge get5f9e769ff6fe4cee02b3b4547200db6b() {
    return _5f9e769ff6fe4cee02b3b4547200db6b;
  }

  public void set5f9e769ff6fe4cee02b3b4547200db6b(NodeEdge _5f9e769ff6fe4cee02b3b4547200db6b) {
    this._5f9e769ff6fe4cee02b3b4547200db6b = _5f9e769ff6fe4cee02b3b4547200db6b;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003In inlineResponse2003In = (InlineResponse2003In) o;
    return Objects.equals(this._5f9e769ff6fe4cee02b3b4547200db6b, inlineResponse2003In._5f9e769ff6fe4cee02b3b4547200db6b);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_5f9e769ff6fe4cee02b3b4547200db6b);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003In {\n");
    
    sb.append("    _5f9e769ff6fe4cee02b3b4547200db6b: ").append(toIndentedString(_5f9e769ff6fe4cee02b3b4547200db6b)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

