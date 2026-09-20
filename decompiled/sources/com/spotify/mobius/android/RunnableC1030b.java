package com.spotify.mobius.android;

import java.util.LinkedList;
import p204p.dqk0;

/* JADX INFO: renamed from: com.spotify.mobius.android.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class RunnableC1030b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5637a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutableLiveQueue f5638b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5639c;

    public /* synthetic */ RunnableC1030b(MutableLiveQueue mutableLiveQueue, Object obj, int i) {
        this.f5637a = i;
        this.f5638b = mutableLiveQueue;
        this.f5639c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5637a) {
            case 0:
                MutableLiveQueue mutableLiveQueue = this.f5638b;
                Object obj = this.f5639c;
                synchronized (mutableLiveQueue.f5627a) {
                    try {
                        dqk0 dqk0Var = mutableLiveQueue.f5630d;
                        if (dqk0Var != null) {
                            dqk0Var.mo31453b(obj);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                MutableLiveQueue mutableLiveQueue2 = this.f5638b;
                LinkedList linkedList = (LinkedList) this.f5639c;
                synchronized (mutableLiveQueue2.f5627a) {
                    try {
                        dqk0 dqk0Var2 = mutableLiveQueue2.f5631e;
                        if (dqk0Var2 != null) {
                            dqk0Var2.mo31453b(linkedList);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }
}
