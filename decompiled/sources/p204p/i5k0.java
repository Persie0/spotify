package p204p;

import com.spotify.music.R;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes3.dex */
public final class i5k0 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f98980a;

    /* JADX INFO: renamed from: b */
    public final oh5 f98981b;

    /* JADX INFO: renamed from: c */
    public final w2y0 f98982c;

    public /* synthetic */ i5k0(oh5 oh5Var, w2y0 w2y0Var, int i) {
        this.f98980a = i;
        this.f98981b = oh5Var;
        this.f98982c = w2y0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        switch (this.f98980a) {
            case 0:
                yes0 yes0Var = (yes0) obj;
                int i = yes0Var.f272055c ? R.string.welcome_back_reedit_ready_message : R.string.welcome_back_reedit_message;
                String strM66936m = this.f98981b.m66936m();
                String strM87089e = yes0Var.f272054b;
                if (strM87089e == null) {
                    strM87089e = this.f98982c.m87089e(i, new Object[0]);
                }
                return new shs0(strM66936m, strM87089e, yes0Var.f272053a + 1);
            case 1:
                jfs0 jfs0Var = (jfs0) obj;
                long j = jfs0Var.f111964a;
                boolean z = jfs0Var.f111965b;
                w2y0 w2y0Var = this.f98982c;
                oh5 oh5Var = this.f98981b;
                return z ? new rgs0(oh5Var.m66936m(), w2y0Var.m87089e(R.string.plused_track_message_singular, new Object[0]), j + ((long) 2), true) : new rgs0(oh5Var.m66936m(), w2y0Var.m87089e(R.string.plused_track_message_plural, new Object[0]), j + ((long) 2), false);
            default:
                return new wfs0(this.f98981b.m66936m(), this.f98982c.m87089e(R.string.you_made_changes_system_message, new Object[0]), ((ifs0) obj).f101825a - 1);
        }
    }
}
