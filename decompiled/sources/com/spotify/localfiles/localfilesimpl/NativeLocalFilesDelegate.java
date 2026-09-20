package com.spotify.localfiles.localfilesimpl;

import com.spotify.localfiles.localfiles.LocalFilesDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0003R\u001c\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\u0003¨\u0006\u000b"}, m24212d2 = {"Lcom/spotify/localfiles/localfilesimpl/NativeLocalFilesDelegate;", "Lcom/spotify/localfiles/localfiles/LocalFilesDelegate;", "<init>", "()V", "Lp/w2a1;", "destroy", "", "nThis", "J", "getNThis$annotations", "Companion", "src_main_java_com_spotify_localfiles_localfilesimpl-localfilesimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeLocalFilesDelegate implements LocalFilesDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long nThis;

    @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0087 J\t\u0010\t\u001a\u00020\u0005H\u0087 ¨\u0006\n"}, m24212d2 = {"Lcom/spotify/localfiles/localfilesimpl/NativeLocalFilesDelegate$Companion;", "", "<init>", "()V", "create", "Lcom/spotify/localfiles/localfilesimpl/NativeLocalFilesDelegate;", "context", "mediaStoreReader", "imageLoader", "noop", "src_main_java_com_spotify_localfiles_localfilesimpl-localfilesimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeLocalFilesDelegate create(Object context, Object mediaStoreReader, Object imageLoader) {
            return NativeLocalFilesDelegate.create(context, mediaStoreReader, imageLoader);
        }

        public final NativeLocalFilesDelegate noop() {
            return NativeLocalFilesDelegate.noop();
        }

        private Companion() {
        }
    }

    private NativeLocalFilesDelegate() {
    }

    public static final native NativeLocalFilesDelegate create(Object obj, Object obj2, Object obj3);

    private static /* synthetic */ void getNThis$annotations() {
    }

    public static final native NativeLocalFilesDelegate noop();

    public final native void destroy();
}
