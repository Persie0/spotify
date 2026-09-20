package p204p;

import com.spotify.yourlibrary.importsyncnotification.importsyncworker.ImportSyncWorker;

/* JADX INFO: loaded from: classes11.dex */
public final class si40 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f209354a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ImportSyncWorker f209355b;

    /* JADX INFO: renamed from: c */
    public int f209356c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si40(ImportSyncWorker importSyncWorker, ibk ibkVar) {
        super(ibkVar);
        this.f209355b = importSyncWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f209354a = obj;
        this.f209356c |= Integer.MIN_VALUE;
        return this.f209355b.m23251A(this);
    }
}
