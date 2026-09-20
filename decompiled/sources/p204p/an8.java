package p204p;

import android.graphics.Bitmap;
import android.os.Parcelable;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class an8 extends f29 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f17322e;

    /* JADX INFO: renamed from: f */
    public final Parcelable f17323f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an8(ysm0 ysm0Var) {
        super(new qr8(R.layout.static_title_scene, R.id.static_title_scene_title));
        this.f17322e = 2;
        this.f17323f = ysm0Var;
    }

    @Override // p204p.f29
    /* JADX INFO: renamed from: b */
    public final zdy0 mo26476b() {
        switch (this.f17322e) {
            case 0:
                return wdy0.f250383a;
            case 1:
                return wdy0.f250383a;
            default:
                return ydy0.f271879a;
        }
    }

    @Override // p204p.f29
    /* JADX INFO: renamed from: d */
    public final void mo26477d(ConstraintLayout constraintLayout) {
        switch (this.f17322e) {
            case 0:
                ((ImageView) mec1.m61562n(constraintLayout, R.id.background_image)).setImageBitmap((Bitmap) this.f17323f);
                break;
            case 1:
                ((ImageView) mec1.m61562n(constraintLayout, R.id.background_image)).setImageBitmap((Bitmap) this.f17323f);
                break;
            default:
                ((ParagraphView) mec1.m61562n(constraintLayout, R.id.static_title_scene_title)).m4191u((ysm0) this.f17323f);
                break;
        }
    }

    @Override // p204p.f29
    /* JADX INFO: renamed from: e */
    public final void mo26478e() {
        int i = this.f17322e;
    }

    @Override // p204p.f29
    /* JADX INFO: renamed from: g */
    public final void mo26479g() {
        int i = this.f17322e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an8(int i, Bitmap bitmap) {
        super(new qr8(R.layout.background_scene, R.id.background_image));
        this.f17322e = i;
        switch (i) {
            case 1:
                super(new qr8(R.layout.background_scene, R.id.background_image));
                this.f17323f = bitmap;
                break;
            default:
                this.f17323f = bitmap;
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m26470h() {
    }

    /* JADX INFO: renamed from: i */
    private final void m26471i() {
    }

    /* JADX INFO: renamed from: j */
    private final void m26472j() {
    }

    /* JADX INFO: renamed from: k */
    private final void m26473k() {
    }

    /* JADX INFO: renamed from: l */
    private final void m26474l() {
    }

    /* JADX INFO: renamed from: m */
    private final void m26475m() {
    }
}
