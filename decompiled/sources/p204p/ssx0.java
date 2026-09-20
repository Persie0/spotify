package p204p;

import android.R;
import android.widget.ImageView;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public class ssx0 extends tsx0 implements rsx0 {

    /* JADX INFO: renamed from: e */
    public final ImageView f213727e;

    public ssx0(san0 san0Var) {
        super(san0Var);
        ImageView imageView = (ImageView) san0Var.findViewById(R.id.icon);
        this.f213727e = imageView;
        q3r0 q3r0VarM26334q = alf1.m26334q(san0Var.findViewById(com.spotify.music.R.id.row_view));
        Collections.addAll(q3r0VarM26334q.f184932c, this.f223446c, this.f223447d);
        Collections.addAll(q3r0VarM26334q.f184933d, imageView);
        q3r0VarM26334q.m72126a();
    }

    @Override // p204p.etx0
    public final ImageView getImageView() {
        return this.f213727e;
    }
}
