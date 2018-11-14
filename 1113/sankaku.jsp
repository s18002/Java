<%@ page (1)="text/html;charset=UTF-8"%>
<%!
public double trianble(double width, double height)
{
  double bar = width * height / 2;
	return bar;
}
%>
三角形の面積（底辺５、高さ２の場合）：
<%=
triangle(5, 2)
%>
