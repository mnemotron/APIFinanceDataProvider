/*
 *  MIT License
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
package api.finance.yahoo.histquote.entity;

/**
 * Yahoo Finance
 *
 * JSON: CurrentTrading
 * 
 * @author mnemotron
 * @version 1.3.0
 * @since 2018-02-11
 */
public class CurrentTradingPeriod
{
	Pre pre;
	Regular regular;
	Post post;
	
	public CurrentTradingPeriod()
	{
		this.pre = new Pre();
		this.regular = new Regular();
		this.post = new Post();
	}
	
	public Pre getPre()
	{
		return pre;
	}
	public void setPre(Pre pre)
	{
		this.pre = pre;
	}
	public Regular getRegular()
	{
		return regular;
	}
	public void setRegular(Regular regular)
	{
		this.regular = regular;
	}
	public Post getPost()
	{
		return post;
	}
	public void setPost(Post post)
	{
		this.post = post;
	}
}
