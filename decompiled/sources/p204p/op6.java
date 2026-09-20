package p204p;

import com.spotify.bluejay.upload.impl.worker.AttachmentUploadWorker;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class op6 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f167761a;

    /* JADX INFO: renamed from: b */
    public File f167762b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f167763c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AttachmentUploadWorker f167764d;

    /* JADX INFO: renamed from: e */
    public int f167765e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op6(AttachmentUploadWorker attachmentUploadWorker, ibk ibkVar) {
        super(ibkVar);
        this.f167764d = attachmentUploadWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f167763c = obj;
        this.f167765e |= Integer.MIN_VALUE;
        return this.f167764d.mo750f(this);
    }
}
