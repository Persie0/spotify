package p204p;

import com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker;

/* JADX INFO: loaded from: classes9.dex */
public final class u501 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f226872a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SetPlaylistPictureWorker f226873b;

    /* JADX INFO: renamed from: c */
    public int f226874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u501(SetPlaylistPictureWorker setPlaylistPictureWorker, ibk ibkVar) {
        super(ibkVar);
        this.f226873b = setPlaylistPictureWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226872a = obj;
        this.f226874c |= Integer.MIN_VALUE;
        return this.f226873b.m19344k(null, null, this);
    }
}
