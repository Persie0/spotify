package p204p;

import com.spotify.libs.connect.events.proto.CastTransferSteps;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x3p {

    /* JADX INFO: renamed from: a */
    public final qre0 f257848a;

    /* JADX INFO: renamed from: b */
    public final er70 f257849b;

    /* JADX INFO: renamed from: c */
    public String f257850c;

    /* JADX INFO: renamed from: d */
    public boolean f257851d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f257852e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final wg61 f257853f = new wg61(new sho(this, 21));

    public x3p(qre0 qre0Var, er70 er70Var) {
        this.f257848a = qre0Var;
        this.f257849b = er70Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m89809a() {
        this.f257850c = null;
        this.f257851d = false;
        this.f257852e.clear();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m89810b(ybc ybcVar) {
        try {
            if (this.f257851d) {
                m89811c(ybcVar);
            } else {
                this.f257852e.add(ybcVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m89811c(ybc ybcVar) {
        zbc zbcVarM12681q = CastTransferSteps.m12681q();
        zbcVarM12681q.m95838r(ybcVar.m93258a());
        String str = this.f257850c;
        if (str != null) {
            zbcVarM12681q.m95837q(str);
        }
        wg61 wg61Var = this.f257853f;
        Long l = (Long) wg61Var.getValue();
        if (l != null) {
            zbcVarM12681q.m95836m(l.longValue());
        }
        this.f257848a.m73616a(zbcVarM12681q.build());
        ybcVar.toString();
    }
}
