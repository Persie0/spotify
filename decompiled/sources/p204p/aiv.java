package p204p;

import android.widget.ImageView;
import com.spotify.campaigns.paragraph.view.ParagraphView;

/* JADX INFO: loaded from: classes6.dex */
public final class aiv {

    /* JADX INFO: renamed from: a */
    public final ImageView f16097a;

    /* JADX INFO: renamed from: b */
    public final ParagraphView f16098b;

    public aiv(ImageView imageView, ParagraphView paragraphView) {
        this.f16097a = imageView;
        this.f16098b = paragraphView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiv)) {
            return false;
        }
        aiv aivVar = (aiv) obj;
        return wj50.m88271j(this.f16097a, aivVar.f16097a) && wj50.m88271j(this.f16098b, aivVar.f16098b);
    }

    public final int hashCode() {
        return this.f16098b.hashCode() + (this.f16097a.hashCode() * 31);
    }
}
