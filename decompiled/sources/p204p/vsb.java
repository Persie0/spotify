package p204p;

import android.content.Context;
import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes5.dex */
public final class vsb implements qc81 {

    /* JADX INFO: renamed from: a */
    public final irb f244398a;

    /* JADX INFO: renamed from: b */
    public final c9n f244399b;

    /* JADX INFO: renamed from: c */
    public final drb f244400c;

    /* JADX INFO: renamed from: d */
    public final Context f244401d;

    public vsb(px0 px0Var, irb irbVar, c9n c9nVar, drb drbVar, Context context) {
        this.f244398a = irbVar;
        this.f244399b = c9nVar;
        this.f244400c = drbVar;
        this.f244401d = context;
    }

    @Override // p204p.qc81
    /* JADX INFO: renamed from: a */
    public final pc81 mo35170a() {
        return new gl8(this, 9);
    }

    @Override // p204p.qc81
    /* JADX INFO: renamed from: b */
    public final boolean mo35171b(nc81 nc81Var) {
        ContextTrack contextTrack = nc81Var.f152461a;
        drb drbVar = this.f244400c;
        if (!drbVar.f52279a.m81406b(contextTrack, drbVar.f52280b)) {
            return false;
        }
        String str = (String) contextTrack.metadata().get("canvas.type");
        hrb hrbVarValueOf = str != null ? hrb.valueOf(str) : null;
        wj50.m88279p(hrbVarValueOf);
        return (hrbVarValueOf == hrb.f94385b || hrbVarValueOf == hrb.f94386c || hrbVarValueOf == hrb.f94387d) && this.f244398a.m51462a(this.f244401d);
    }

    @Override // p204p.qc81
    public final oc81 type() {
        return oc81.f163865b;
    }
}
