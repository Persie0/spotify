package p204p;

import com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker;

/* JADX INFO: loaded from: classes9.dex */
public final class t501 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f217188a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SetPlaylistPictureWorker f217189b;

    /* JADX INFO: renamed from: c */
    public int f217190c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t501(SetPlaylistPictureWorker setPlaylistPictureWorker, ibk ibkVar) {
        super(ibkVar);
        this.f217189b = setPlaylistPictureWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f217188a = obj;
        this.f217190c |= Integer.MIN_VALUE;
        return this.f217189b.m19343j(null, null, this);
    }
}
