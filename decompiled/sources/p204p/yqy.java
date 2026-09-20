package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class yqy extends ibk {

    /* JADX INFO: renamed from: a */
    public long f275325a;

    /* JADX INFO: renamed from: b */
    public Iterator f275326b;

    /* JADX INFO: renamed from: c */
    public qqy f275327c;

    /* JADX INFO: renamed from: d */
    public int f275328d;

    /* JADX INFO: renamed from: e */
    public int f275329e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f275330f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zqy f275331g;

    /* JADX INFO: renamed from: h */
    public int f275332h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqy(zqy zqyVar, ibk ibkVar) {
        super(ibkVar);
        this.f275331g = zqyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f275330f = obj;
        this.f275332h |= Integer.MIN_VALUE;
        return this.f275331g.m96751d(this);
    }
}
