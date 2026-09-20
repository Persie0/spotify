package p204p;

import android.net.Uri;
import com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker;

/* JADX INFO: loaded from: classes9.dex */
public final class w501 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f247948a;

    /* JADX INFO: renamed from: b */
    public Uri f247949b;

    /* JADX INFO: renamed from: c */
    public boolean f247950c;

    /* JADX INFO: renamed from: d */
    public int f247951d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f247952e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SetPlaylistPictureWorker f247953f;

    /* JADX INFO: renamed from: g */
    public int f247954g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w501(SetPlaylistPictureWorker setPlaylistPictureWorker, ibk ibkVar) {
        super(ibkVar);
        this.f247953f = setPlaylistPictureWorker;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f247952e = obj;
        this.f247954g |= Integer.MIN_VALUE;
        return this.f247953f.m19346m(null, null, false, this);
    }
}
