package p204p;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes6.dex */
public final class jy41 extends f29 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f117292e;

    /* JADX INFO: renamed from: f */
    public final ysm0 f117293f;

    /* JADX INFO: renamed from: g */
    public final ysm0 f117294g;

    /* JADX INFO: renamed from: h */
    public final Bitmap f117295h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy41(ysm0 ysm0Var, ysm0 ysm0Var2, Bitmap bitmap, int i) {
        super(new qr8(R.layout.box_reveal_scene, R.id.box_reveal_title));
        this.f117292e = i;
        switch (i) {
            case 1:
                super(new qr8(R.layout.static_image_title_subtitle_scene, R.id.static_title));
                this.f117293f = ysm0Var;
                this.f117294g = ysm0Var2;
                this.f117295h = bitmap;
                break;
            default:
                this.f117293f = ysm0Var;
                this.f117294g = ysm0Var2;
                this.f117295h = bitmap;
                break;
        }
    }

    @Override // p204p.f29
    /* JADX INFO: renamed from: b */
    public final zdy0 mo26476b() {
        switch (this.f117292e) {
            case 0:
                break;
        }
        return ydy0.f271879a;
    }

    @Override // p204p.f29
    /* JADX INFO: renamed from: d */
    public final void mo26477d(ConstraintLayout constraintLayout) {
        switch (this.f117292e) {
            case 0:
                ((ParagraphView) mec1.m61562n(constraintLayout, R.id.box_reveal_title)).m4191u(this.f117293f);
                ((ParagraphView) mec1.m61562n(constraintLayout, R.id.box_reveal_subtitle)).m4191u(this.f117294g);
                ((ImageView) mec1.m61562n(constraintLayout, R.id.box_reveal_image)).setImageBitmap(this.f117295h);
                break;
            default:
                ((ParagraphView) mec1.m61562n(constraintLayout, R.id.static_title)).m4191u(this.f117293f);
                ((ParagraphView) mec1.m61562n(constraintLayout, R.id.static_subtitle)).m4191u(this.f117294g);
                ((ImageView) mec1.m61562n(constraintLayout, R.id.static_image)).setImageBitmap(this.f117295h);
                break;
        }
    }

    @Override // p204p.f29
    /* JADX INFO: renamed from: e */
    public final void mo26478e() {
        int i = this.f117292e;
    }

    @Override // p204p.f29
    /* JADX INFO: renamed from: g */
    public final void mo26479g() {
        int i = this.f117292e;
    }

    /* JADX INFO: renamed from: h */
    private final void m54776h() {
    }

    /* JADX INFO: renamed from: i */
    private final void m54777i() {
    }

    /* JADX INFO: renamed from: j */
    private final void m54778j() {
    }

    /* JADX INFO: renamed from: k */
    private final void m54779k() {
    }
}
