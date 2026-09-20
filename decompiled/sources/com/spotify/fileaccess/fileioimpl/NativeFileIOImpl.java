package com.spotify.fileaccess.fileioimpl;

import com.spotify.fileaccess.fileio.NativeFileIO;
import kotlin.Metadata;
import p204p.pwi0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\rB\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/fileaccess/fileioimpl/NativeFileIOImpl;", "Lcom/spotify/fileaccess/fileio/NativeFileIO;", "<init>", "()V", "Lp/w2a1;", "destroy", "", "value", "nThis", "J", "getNThis", "()J", "Companion", "p/pwi0", "src_main_java_com_spotify_fileaccess_fileioimpl-fileioimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeFileIOImpl implements NativeFileIO {
    public static final pwi0 Companion = new pwi0();
    private long nThis;

    private NativeFileIOImpl() {
    }

    public static final native NativeFileIO create();

    @Override // com.spotify.fileaccess.fileio.NativeFileIO
    public native void destroy();

    @Override // com.spotify.fileaccess.fileio.NativeFileIO
    public long getNThis() {
        return this.nThis;
    }
}
