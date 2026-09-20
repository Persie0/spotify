package p204p;

import com.spotify.base.java.logging.Logger;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class w661 implements hgm {

    /* JADX INFO: renamed from: a */
    public final voi f248265a;

    /* JADX INFO: renamed from: b */
    public final obr f248266b;

    /* JADX INFO: renamed from: c */
    public final c9k f248267c;

    /* JADX INFO: renamed from: d */
    public final di41 f248268d;

    public w661(voi voiVar, obr obrVar, i24 i24Var, luk lukVar) {
        this.f248265a = voiVar;
        this.f248266b = obrVar;
        c9k c9kVarM16o = AbstractC0000a.m16o(lukVar);
        this.f248267c = c9kVarM16o;
        if (!i24Var.m49447a()) {
            Logger.m3969e("NavCmdRegistrar", "[NAV_REG] Registration disabled — skipping");
        } else {
            this.f248268d = x0h1.m89578u(c9kVarM16o, null, 0, new v831(this, null, 16), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007e  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:0x013e A[LOOP:1: B:47:0x013c->B:48:0x013e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:73:0x0207  */
    /* JADX WARN: Code duplicated, block: B:75:0x020d  */
    /* JADX WARN: Code duplicated, block: B:78:0x023e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x024c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x023a -> B:79:0x0242). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x023e -> B:79:0x0242). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m87269a(p204p.w661 r24, p204p.ibk r25) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.w661.m87269a(p.w661, p.ibk):java.lang.Object");
    }

    @Override // p204p.hgm
    public final void shutdown() {
        di41 di41Var = this.f248268d;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        kk40.m56680v(this.f248267c, null);
    }
}
