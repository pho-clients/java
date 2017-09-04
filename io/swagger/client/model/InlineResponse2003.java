package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse2003In;
import io.swagger.client.model.NodeEdge;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2003
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-04T08:23:56.671Z")
public class InlineResponse2003 {
  @SerializedName("from")
  private List<NodeEdge> from = new ArrayList<NodeEdge>();

  @SerializedName("to")
  private List<NodeEdge> to = new ArrayList<NodeEdge>();

  @SerializedName("in")
  private List<InlineResponse2003In> in = new ArrayList<InlineResponse2003In>();

  @SerializedName("out")
  private List<InlineResponse2003In> out = new ArrayList<InlineResponse2003In>();

  public InlineResponse2003 from(List<NodeEdge> from) {
    this.from = from;
    return this;
  }

  public InlineResponse2003 addFromItem(NodeEdge fromItem) {
    this.from.add(fromItem);
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(required = true, value = "")
  public List<NodeEdge> getFrom() {
    return from;
  }

  public void setFrom(List<NodeEdge> from) {
    this.from = from;
  }

  public InlineResponse2003 to(List<NodeEdge> to) {
    this.to = to;
    return this;
  }

  public InlineResponse2003 addToItem(NodeEdge toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(required = true, value = "")
  public List<NodeEdge> getTo() {
    return to;
  }

  public void setTo(List<NodeEdge> to) {
    this.to = to;
  }

  public InlineResponse2003 in(List<InlineResponse2003In> in) {
    this.in = in;
    return this;
  }

  public InlineResponse2003 addInItem(InlineResponse2003In inItem) {
    this.in.add(inItem);
    return this;
  }

   /**
   * Get in
   * @return in
  **/
  @ApiModelProperty(required = true, value = "")
  public List<InlineResponse2003In> getIn() {
    return in;
  }

  public void setIn(List<InlineResponse2003In> in) {
    this.in = in;
  }

  public InlineResponse2003 out(List<InlineResponse2003In> out) {
    this.out = out;
    return this;
  }

  public InlineResponse2003 addOutItem(InlineResponse2003In outItem) {
    this.out.add(outItem);
    return this;
  }

   /**
   * Get out
   * @return out
  **/
  @ApiModelProperty(required = true, value = "")
  public List<InlineResponse2003In> getOut() {
    return out;
  }

  public void setOut(List<InlineResponse2003In> out) {
    this.out = out;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.from, inlineResponse2003.from) &&
        Objects.equals(this.to, inlineResponse2003.to) &&
        Objects.equals(this.in, inlineResponse2003.in) &&
        Objects.equals(this.out, inlineResponse2003.out);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, in, out);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    out: ").append(toIndentedString(out)).append("\n");
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

