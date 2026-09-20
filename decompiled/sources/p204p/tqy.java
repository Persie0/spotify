package p204p;

import com.spotify.inappuserfeedback.worker.FeedbackUploadWorker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class tqy extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f222915a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FeedbackUploadWorker f222916b;

    /* JADX INFO: renamed from: c */
    public int f222917c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqy(FeedbackUploadWorker feedbackUploadWorker, ibk ibkVar) {
        super(ibkVar);
        this.f222916b = feedbackUploadWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222915a = obj;
        this.f222917c |= Integer.MIN_VALUE;
        Serializable serializableM12019j = this.f222916b.m12019j(null, null, null, this);
        return serializableM12019j == yuk.f276404a ? serializableM12019j : new s6x0(serializableM12019j);
    }
}
