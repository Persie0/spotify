package p204p;

import com.spotify.cosmos.servicebasedrouter.RemoteNativeCallbackRouter;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class t52 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f217194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f217195b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t52(int i, gh00 gh00Var) {
        super(1);
        this.f217194a = i;
        this.f217195b = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f217194a) {
            case 0:
                this.f217195b.invoke(u52.f226881c);
                return w2a1.f247311a;
            case 1:
                this.f217195b.invoke(u52.f226881c);
                return w2a1.f247311a;
            case 2:
                this.f217195b.invoke(u52.f226881c);
                return w2a1.f247311a;
            case 3:
                this.f217195b.invoke(new b82((pdu) obj));
                return w2a1.f247311a;
            case 4:
                this.f217195b.invoke((hb2) obj);
                return w2a1.f247311a;
            case 5:
                this.f217195b.invoke(new ab2((String) obj));
                return w2a1.f247311a;
            case 6:
                this.f217195b.invoke(new db2((ib2) obj));
                return w2a1.f247311a;
            case 7:
                this.f217195b.invoke(new gb2((String) obj));
                return w2a1.f247311a;
            case 8:
                this.f217195b.invoke((String) obj);
                return w2a1.f247311a;
            case 9:
                this.f217195b.invoke((String) obj);
                return w2a1.f247311a;
            case 10:
                this.f217195b.invoke(av2.f20073a);
                return w2a1.f247311a;
            case 11:
                if (((hkl) obj).equals(fkl.f70558a)) {
                    this.f217195b.invoke(q03.f183890a);
                }
                return w2a1.f247311a;
            case 12:
                ((Boolean) obj).booleanValue();
                this.f217195b.invoke(f33.f65340a);
                return w2a1.f247311a;
            case 13:
                ((icp) obj).f100858d = new mk0(this.f217195b, null, 2);
                return w2a1.f247311a;
            case 14:
                this.f217195b.invoke(mg3.f143289a);
                return w2a1.f247311a;
            case 15:
                this.f217195b.invoke(new lg3(((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 16:
                this.f217195b.invoke(new dn5((String) obj));
                return w2a1.f247311a;
            case 17:
                this.f217195b.invoke(new es6(!((Boolean) obj).booleanValue()));
                return w2a1.f247311a;
            case 18:
                if (((kjv) obj) instanceof hjv) {
                    this.f217195b.invoke(zc7.f281469a);
                }
                return w2a1.f247311a;
            case 19:
                if (ya7.f270820a[((jut0) obj).ordinal()] == 1) {
                    this.f217195b.invoke(zc7.f281470b);
                }
                return w2a1.f247311a;
            case 20:
                ((icp) obj).f100858d = new mk0(this.f217195b, null, 5);
                return w2a1.f247311a;
            case 21:
                ((Boolean) obj).booleanValue();
                this.f217195b.invoke(bo7.f29027a);
                return w2a1.f247311a;
            case 22:
                ((Boolean) obj).booleanValue();
                this.f217195b.invoke(zo7.f284719a);
                return w2a1.f247311a;
            case 23:
                this.f217195b.invoke(new lbo0(((z00) obj).f277928e));
                return w2a1.f247311a;
            case 24:
                this.f217195b.invoke(new RemoteNativeCallbackRouter(((zl8) obj).mo64738s().getRemoteNativeRouter()));
                return w2a1.f247311a;
            case 25:
                this.f217195b.invoke((cs8) obj);
                return w2a1.f247311a;
            case 26:
                this.f217195b.invoke(Integer.valueOf(n0e1.m63437n((int) (((Number) obj).floatValue() * 100), 0, 100)));
                return w2a1.f247311a;
            case 27:
                this.f217195b.invoke(Integer.valueOf(n0e1.m63437n((int) (((Number) obj).floatValue() * 100), 0, 100)));
                return w2a1.f247311a;
            case 28:
                this.f217195b.invoke((j79) obj);
                return w2a1.f247311a;
            default:
                j79 j79Var = (j79) obj;
                if (!j79Var.equals(h79.f88384c) && !j79Var.equals(h79.f88382a) && !j79Var.equals(h79.f88383b) && !(j79Var instanceof i79) && !j79Var.equals(h79.f88385d) && !j79Var.equals(h79.f88386e)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f217195b.invoke(m8o0.f141102a);
                return w2a1.f247311a;
        }
    }
}
