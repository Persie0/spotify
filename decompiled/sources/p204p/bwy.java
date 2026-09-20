package p204p;

import com.spotify.fileaccess.fileio.NativeFileIO;
import com.spotify.fileaccess.fileioimpl.NativeFileIOImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class bwy implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final NativeFileIO f31742a;

    public bwy() {
        NativeFileIOImpl.Companion.getClass();
        this.f31742a = NativeFileIOImpl.create();
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f31742a.destroy();
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
