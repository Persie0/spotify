package p204p;

import com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker;

/* JADX INFO: loaded from: classes9.dex */
public final class v501 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f237279a;

    /* JADX INFO: renamed from: b */
    public Object f237280b;

    /* JADX INFO: renamed from: c */
    public SetPlaylistPictureWorker f237281c;

    /* JADX INFO: renamed from: d */
    public String f237282d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f237283e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SetPlaylistPictureWorker f237284f;

    /* JADX INFO: renamed from: g */
    public int f237285g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v501(SetPlaylistPictureWorker setPlaylistPictureWorker, ibk ibkVar) {
        super(ibkVar);
        this.f237284f = setPlaylistPictureWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f237283e = obj;
        this.f237285g |= Integer.MIN_VALUE;
        return this.f237284f.m19345l(null, null, this);
    }
}
