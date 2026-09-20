package p204p;

import com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker;

/* JADX INFO: loaded from: classes9.dex */
public final class x501 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f258236a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SetPlaylistPictureWorker f258237b;

    /* JADX INFO: renamed from: c */
    public int f258238c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x501(SetPlaylistPictureWorker setPlaylistPictureWorker, ibk ibkVar) {
        super(ibkVar);
        this.f258237b = setPlaylistPictureWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f258236a = obj;
        this.f258238c |= Integer.MIN_VALUE;
        return this.f258237b.m19347n(null, this);
    }
}
