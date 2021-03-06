/*
 * MIT License
 *
 * Copyright (c) 2018 mnemotron
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package api.finance.yahoo.symbol.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Result Set
 * 
 * @author mnemotron
 * @version 1.0.0
 * @since 2018-01-01
 */
public class ResultSet
{
	private String query;
	private List<Symbol> result;

	public ResultSet()
	{
		this.query = new String();
		this.result = new ArrayList<Symbol>();
	}

	public String getQuery()
	{
		return query;
	}

	public void setQuery(String query)
	{
		this.query = query;
	}

	public List<Symbol> getResult()
	{
		return result;
	}

	public void setResult(List<Symbol> result)
	{
		this.result = result;
	}

	public String toString()
	{
		StringBuilder locStringBuilder = new StringBuilder();

		locStringBuilder.append("query:" + this.getQuery() + "\n");

		for (Symbol symbol : result)
		{
			locStringBuilder.append(symbol.toString() + "\n");
		}

		return locStringBuilder.toString();
	}

}
