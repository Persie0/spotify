package p204p;

import android.content.Context;
import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: classes5.dex */
public final class urb implements qc81 {

    /* JADX INFO: renamed from: a */
    public final irb f233317a;

    /* JADX INFO: renamed from: b */
    public final z8n f233318b;

    /* JADX INFO: renamed from: c */
    public final drb f233319c;

    /* JADX INFO: renamed from: d */
    public final Context f233320d;

    public urb(px0 px0Var, irb irbVar, z8n z8nVar, drb drbVar, Context context) {
        this.f233317a = irbVar;
        this.f233318b = z8nVar;
        this.f233319c = drbVar;
        this.f233320d = context;
    }

    @Override // p204p.qc81
    /* JADX INFO: renamed from: a */
    public final pc81 mo35170a() {
        return new vk9(this, 6);
    }

    @Override // p204p.qc81
    /* JADX INFO: renamed from: b */
    public final boolean mo35171b(nc81 nc81Var) {
        ContextTrack contextTrack = nc81Var.f152461a;
        drb drbVar = this.f233319c;
        if (!drbVar.f52279a.m81406b(contextTrack, drbVar.f52280b)) {
            return false;
        }
        String str = (String) contextTrack.metadata().get("canvas.type");
        hrb hrbVarValueOf = str != null ? hrb.valueOf(str) : null;
        wj50.m88279p(hrbVarValueOf);
        return (hrbVarValueOf == hrb.f94385b || hrbVarValueOf == hrb.f94386c || hrbVarValueOf == hrb.f94387d || !this.f233317a.m51462a(this.f233320d)) ? false : true;
    }

    @Override // p204p.qc81
    public final oc81 type() {
        return oc81.f163864a;
    }
}
