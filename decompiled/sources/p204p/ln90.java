package p204p;

import android.content.res.Resources;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class ln90 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f135121a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jb81 f135122b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ln90(jb81 jb81Var, int i) {
        super(1);
        this.f135121a = i;
        this.f135122b = jb81Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f135121a) {
            case 0:
                return this.f135122b.f110693c;
            default:
                Resources resources = (Resources) obj;
                jb81 jb81Var = this.f135122b;
                String str = jb81Var.f110694d;
                if (wl51.m88460J0(str)) {
                    str = null;
                }
                return str == null ? g6f.m43753y0(pqo0.m70675o(jb81Var.f110701k), resources.getString(R.string.host_name_single_line_track_info_separator), null, null, null, 62) : str;
        }
    }
}
