package p204p;

import android.content.res.Resources;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class yt81 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f276039a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jb81 f276040b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f12 f276041c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f276042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yt81(jb81 jb81Var, f12 f12Var, boolean z, int i) {
        super(1);
        this.f276039a = i;
        this.f276040b = jb81Var;
        this.f276041c = f12Var;
        this.f276042d = z;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f276039a) {
            case 0:
                Resources resources = (Resources) obj;
                jb81 jb81Var = this.f276040b;
                int iM38547C = edb.m38547C(jb81Var.f110697g);
                if (iM38547C == 0) {
                    return this.f276041c.f64765a;
                }
                if (iM38547C == 1) {
                    return this.f276042d ? resources.getString(R.string.next_track) : jb81Var.f110693c;
                }
                throw new NoWhenBranchMatchedException();
            default:
                jb81 jb81Var2 = this.f276040b;
                int iM38547C2 = edb.m38547C(jb81Var2.f110697g);
                if (iM38547C2 == 0) {
                    return this.f276041c.f64766b;
                }
                if (iM38547C2 == 1) {
                    return this.f276042d ? "" : jb81Var2.f110694d;
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
