package p204p;

import android.view.Surface;
import com.spotify.coremediarenderer.videosinkimpl.NativeVideoSinkImpl;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class xte {

    /* JADX INFO: renamed from: a */
    public final String f265849a;

    /* JADX INFO: renamed from: b */
    public final String f265850b;

    /* JADX INFO: renamed from: c */
    public final String f265851c;

    /* JADX INFO: renamed from: d */
    public final String f265852d;

    /* JADX INFO: renamed from: e */
    public final String f265853e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zte f265854f;

    public xte(zte zteVar, String str, String str2, String str3, String str4, String str5) {
        this.f265854f = zteVar;
        this.f265849a = str;
        this.f265850b = str2;
        this.f265851c = str3;
        this.f265852d = str4;
        this.f265853e = str5;
    }

    /* JADX INFO: renamed from: a */
    public final void m92012a(Surface surface) {
        Objects.toString(surface);
        this.f265854f.f286144b.getClass();
        NativeVideoSinkImpl.nativeSetRenderTarget(this.f265849a, this.f265850b, this.f265851c, this.f265852d, this.f265853e, surface);
    }
}
