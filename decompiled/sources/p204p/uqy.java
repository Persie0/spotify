package p204p;

import com.spotify.inappuserfeedback.worker.FeedbackUploadWorker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class uqy extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f233149a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FeedbackUploadWorker f233150b;

    /* JADX INFO: renamed from: c */
    public int f233151c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqy(FeedbackUploadWorker feedbackUploadWorker, ibk ibkVar) {
        super(ibkVar);
        this.f233150b = feedbackUploadWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f233149a = obj;
        this.f233151c |= Integer.MIN_VALUE;
        Serializable serializableM12020k = this.f233150b.m12020k(null, null, null, this);
        return serializableM12020k == yuk.f276404a ? serializableM12020k : new s6x0(serializableM12020k);
    }
}
