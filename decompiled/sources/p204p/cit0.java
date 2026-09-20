package p204p;

import com.spotify.serviceapi.android.quasarworker.QuasarWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class cit0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f38432a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ QuasarWorker f38433b;

    /* JADX INFO: renamed from: c */
    public int f38434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cit0(QuasarWorker quasarWorker, ibk ibkVar) {
        super(ibkVar);
        this.f38433b = quasarWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38432a = obj;
        this.f38434c |= Integer.MIN_VALUE;
        return QuasarWorker.m20943i(this.f38433b, null, this);
    }
}
