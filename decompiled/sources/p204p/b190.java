package p204p;

import android.util.Base64;
import com.spotify.homeagent.p079v1.WorldListAttributes;
import com.spotify.promptablesection.PromptableSectionListAttributes;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class b190 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22263a;

    /* JADX INFO: renamed from: b */
    public final wt80 f22264b;

    /* JADX INFO: renamed from: c */
    public final yz80 f22265c;

    /* JADX INFO: renamed from: d */
    public final wg61 f22266d;

    public b190(wt80 wt80Var, yz80 yz80Var, int i) {
        this.f22263a = i;
        switch (i) {
            case 1:
                this.f22264b = wt80Var;
                this.f22265c = yz80Var;
                this.f22266d = new wg61(rfd1.f198597P0);
                break;
            default:
                this.f22264b = wt80Var;
                this.f22265c = yz80Var;
                this.f22266d = new wg61(C2087le.f132397Y0);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    /* JADX WARN: Code duplicated, block: B:78:0x0195  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [p.fbk, p.gva] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.spotify.promptablesection.PromptableSectionListAttributes] */
    /* JADX WARN: Type inference failed for: r4v4, types: [p.fbk, p.gva] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.spotify.homeagent.v1.WorldListAttributes] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: a */
    public final Object m27899a(String str, String str2, ibk ibkVar) {
        z090 z090Var;
        qu80 qu80Var;
        w2a1 w2a1Var;
        String str3;
        wae1 wae1Var;
        qu80 qu80Var2;
        w2a1 w2a1Var2;
        String str4;
        switch (this.f22263a) {
            case 0:
                if (ibkVar instanceof z090) {
                    z090Var = (z090) ibkVar;
                    int i = z090Var.f278036d;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        z090Var.f278036d = i - Integer.MIN_VALUE;
                    } else {
                        z090Var = new z090(this, ibkVar);
                    }
                } else {
                    z090Var = new z090(this, ibkVar);
                }
                Object objM94973b = z090Var.f278034b;
                int i2 = z090Var.f278036d;
                PromptableSectionListAttributes promptableSectionListAttributesM19917t = 0;
                promptableSectionListAttributesM19917t = 0;
                yuk yukVar = yuk.f276404a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        str2 = z090Var.f278033a;
                        bga.m29073P(objM94973b);
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM94973b);
                    }
                    qu80Var = (qu80) objM94973b;
                    w2a1Var = w2a1.f247311a;
                    if (qu80Var == null) {
                        return w2a1Var;
                    }
                    str3 = (String) qu80Var.f192599e.f271272q.get("promptable_section_attributes");
                    if (str3 != null) {
                        try {
                            promptableSectionListAttributesM19917t = PromptableSectionListAttributes.m19917t(Base64.decode(str3, 0));
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    if (promptableSectionListAttributesM19917t == 0) {
                        return new c6x0(dms0.f50608a);
                    }
                    if (promptableSectionListAttributesM19917t.m19923s() || promptableSectionListAttributesM19917t.m19918n().m19926p() != z6z0.VALIDATION_ERROR) {
                        int i3 = y090.f267935a[promptableSectionListAttributesM19917t.m19922r().ordinal()];
                        return i3 != 1 ? w2a1Var : w2a1Var;
                    }
                    String strM19927q = promptableSectionListAttributesM19917t.m19918n().m19927q();
                    if (wl51.m88460J0(strM19927q)) {
                        strM19927q = "Prompt validation failed";
                    }
                    return new c6x0(new fms0(strM19927q));
                }
                bga.m29073P(objM94973b);
                rz80 rz80Var = new rz80("generate", (gva) promptableSectionListAttributesM19917t, gva.m45888f(str), 10);
                z090Var.f278033a = str2;
                z090Var.f278036d = 1;
                objM94973b = yz80.m94973b(this.f22265c, str2, rz80Var, z090Var);
                if (objM94973b == yukVar) {
                    return yukVar;
                }
                p2x0 p2x0Var = (p2x0) objM94973b;
                if (p2x0Var instanceof k2x0) {
                    return new c6x0(new ems0(new IOException(((k2x0) p2x0Var).f118699a.mo27977b())));
                }
                g090 g090Var = new g090(this, str2, promptableSectionListAttributesM19917t, 2);
                z090Var.f278033a = null;
                z090Var.f278036d = 2;
                objM94973b = s1h1.m76980u(5000L, g090Var, z090Var);
                if (objM94973b == yukVar) {
                    return yukVar;
                }
                qu80Var = (qu80) objM94973b;
                w2a1Var = w2a1.f247311a;
                if (qu80Var == null) {
                    return w2a1Var;
                }
                str3 = (String) qu80Var.f192599e.f271272q.get("promptable_section_attributes");
                if (str3 != null) {
                    promptableSectionListAttributesM19917t = PromptableSectionListAttributes.m19917t(Base64.decode(str3, 0));
                    break;
                }
                if (promptableSectionListAttributesM19917t == 0) {
                    return new c6x0(dms0.f50608a);
                }
                if (promptableSectionListAttributesM19917t.m19923s()) {
                }
                int i4 = y090.f267935a[promptableSectionListAttributesM19917t.m19922r().ordinal()];
                return i4 != 1 ? w2a1Var : w2a1Var;
            default:
                if (ibkVar instanceof wae1) {
                    wae1Var = (wae1) ibkVar;
                    int i5 = wae1Var.f249464d;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        wae1Var.f249464d = i5 - Integer.MIN_VALUE;
                    } else {
                        wae1Var = new wae1(this, ibkVar);
                    }
                } else {
                    wae1Var = new wae1(this, ibkVar);
                }
                Object objM94973b2 = wae1Var.f249462b;
                int i6 = wae1Var.f249464d;
                WorldListAttributes worldListAttributesM11848u = 0;
                worldListAttributesM11848u = 0;
                yuk yukVar2 = yuk.f276404a;
                if (i6 != 0) {
                    if (i6 == 1) {
                        str2 = wae1Var.f249461a;
                        bga.m29073P(objM94973b2);
                    } else {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(objM94973b2);
                    }
                    qu80Var2 = (qu80) objM94973b2;
                    w2a1Var2 = w2a1.f247311a;
                    if (qu80Var2 == null) {
                        return w2a1Var2;
                    }
                    str4 = (String) qu80Var2.f192599e.f271272q.get("world_attributes");
                    if (str4 != null) {
                        try {
                            worldListAttributesM11848u = WorldListAttributes.m11848u(Base64.decode(str4, 0));
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                    if (worldListAttributesM11848u == 0) {
                        return new c6x0(dms0.f50608a);
                    }
                    if (worldListAttributesM11848u.m11855t() || worldListAttributesM11848u.m11849n().m11846o() != uae1.VALIDATION_ERROR) {
                        int i7 = vae1.f239257a[worldListAttributesM11848u.m11854s().ordinal()];
                        return i7 != 1 ? w2a1Var2 : w2a1Var2;
                    }
                    String strM11847p = worldListAttributesM11848u.m11849n().m11847p();
                    if (wl51.m88460J0(strM11847p)) {
                        strM11847p = "Prompt validation failed";
                    }
                    return new c6x0(new fms0(strM11847p));
                }
                bga.m29073P(objM94973b2);
                rz80 rz80Var2 = new rz80("generate", (gva) worldListAttributesM11848u, gva.m45888f(str), 10);
                wae1Var.f249461a = str2;
                wae1Var.f249464d = 1;
                objM94973b2 = yz80.m94973b(this.f22265c, str2, rz80Var2, wae1Var);
                if (objM94973b2 == yukVar2) {
                    return yukVar2;
                }
                p2x0 p2x0Var2 = (p2x0) objM94973b2;
                if (p2x0Var2 instanceof k2x0) {
                    return new c6x0(new ems0(new IOException(((k2x0) p2x0Var2).f118699a.mo27977b())));
                }
                gud1 gud1Var = new gud1(this, str2, worldListAttributesM11848u, 6);
                wae1Var.f249461a = null;
                wae1Var.f249464d = 2;
                objM94973b2 = s1h1.m76980u(5000L, gud1Var, wae1Var);
                if (objM94973b2 == yukVar2) {
                    return yukVar2;
                }
                qu80Var2 = (qu80) objM94973b2;
                w2a1Var2 = w2a1.f247311a;
                if (qu80Var2 == null) {
                    return w2a1Var2;
                }
                str4 = (String) qu80Var2.f192599e.f271272q.get("world_attributes");
                if (str4 != null) {
                    worldListAttributesM11848u = WorldListAttributes.m11848u(Base64.decode(str4, 0));
                    break;
                }
                if (worldListAttributesM11848u == 0) {
                    return new c6x0(dms0.f50608a);
                }
                if (worldListAttributesM11848u.m11855t()) {
                }
                int i8 = vae1.f239257a[worldListAttributesM11848u.m11854s().ordinal()];
                return i8 != 1 ? w2a1Var2 : w2a1Var2;
        }
    }
}
