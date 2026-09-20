package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tof1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f222253a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ev61 f222254b;

    public /* synthetic */ tof1(int i, ev61 ev61Var) {
        this.f222253a = i;
        this.f222254b = ev61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f222253a) {
            case 0:
                hpf1.f93774d.m83848a("get checkbox consent timed out", new Object[0]);
                this.f222254b.m40099d(Boolean.FALSE);
                break;
            default:
                this.f222254b.m40098c(new IOException("TIMEOUT"));
                break;
        }
    }
}
