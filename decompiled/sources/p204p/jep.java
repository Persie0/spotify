package p204p;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class jep implements hhs {

    /* JADX INFO: renamed from: a */
    public final ehs f111638a;

    /* JADX INFO: renamed from: b */
    public bhs f111639b;

    /* JADX INFO: renamed from: c */
    public boolean f111640c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ lep f111641d;

    public jep(lep lepVar, ehs ehsVar) {
        this.f111641d = lepVar;
        this.f111638a = ehsVar;
    }

    @Override // p204p.hhs
    public final void release() {
        Handler handler = this.f111641d.f132648u;
        handler.getClass();
        h0b1.m46304c0(handler, new RunnableC2210od(this, 29));
    }
}
