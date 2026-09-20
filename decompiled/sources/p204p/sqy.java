package p204p;

import com.spotify.inappuserfeedback.worker.FeedbackUploadWorker;

/* JADX INFO: loaded from: classes7.dex */
public final class sqy extends ibk {

    /* JADX INFO: renamed from: a */
    public String[] f213185a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f213186b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FeedbackUploadWorker f213187c;

    /* JADX INFO: renamed from: d */
    public int f213188d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqy(FeedbackUploadWorker feedbackUploadWorker, ibk ibkVar) {
        super(ibkVar);
        this.f213187c = feedbackUploadWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213186b = obj;
        this.f213188d |= Integer.MIN_VALUE;
        return this.f213187c.mo750f(this);
    }
}
