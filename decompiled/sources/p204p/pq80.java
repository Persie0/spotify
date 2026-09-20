package p204p;

import com.spotify.concertcampaignview.p047v1.CtaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class pq80 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f180211a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f180212b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tq80 f180213c;

    public /* synthetic */ pq80(niz nizVar, tq80 tq80Var, int i) {
        this.f180211a = i;
        this.f180212b = nizVar;
        this.f180213c = tq80Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[PHI: r5
      0x0057: PHI (r5v9 int) = (r5v8 int), (r5v10 int) binds: [B:27:0x0061, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        oq80 oq80Var;
        sq80 sq80Var;
        int i;
        int i2;
        switch (this.f180211a) {
            case 0:
                if (fbkVar instanceof oq80) {
                    oq80Var = (oq80) fbkVar;
                    int i3 = oq80Var.f168133b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        oq80Var.f168133b = i3 - Integer.MIN_VALUE;
                    } else {
                        oq80Var = new oq80(this, fbkVar);
                    }
                } else {
                    oq80Var = new oq80(this, fbkVar);
                }
                Object obj2 = oq80Var.f168132a;
                int i4 = oq80Var.f168133b;
                if (i4 == 0) {
                    bga.m29073P(obj2);
                    qu80 qu80Var = (qu80) obj;
                    List list = qu80Var.f192598d;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new q5a0((nw80) it.next()));
                    }
                    t5a0 t5a0Var = new t5a0(qu80Var.f192598d.size(), arrayList, this.f180213c.f222762m.f70323b ? qu80Var.f192605k : lau.f131415a, qu80Var.f192607m);
                    oq80Var.f168133b = 1;
                    Object objEmit = this.f180212b.emit(t5a0Var, oq80Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof sq80) {
                    sq80Var = (sq80) fbkVar;
                    int i5 = sq80Var.f213037b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        sq80Var.f213037b = i5 - Integer.MIN_VALUE;
                    } else {
                        sq80Var = new sq80(this, fbkVar);
                    }
                } else {
                    sq80Var = new sq80(this, fbkVar);
                }
                Object obj3 = sq80Var.f213036a;
                int i6 = sq80Var.f213037b;
                if (i6 == 0) {
                    bga.m29073P(obj3);
                    qu80 qu80Var2 = (qu80) obj;
                    int i7 = qu80Var2.f192595a;
                    int iOrdinal = this.f180213c.f222762m.f70322a.f60257d.ordinal();
                    if (iOrdinal == 0) {
                        i = i7;
                    } else if (iOrdinal == 1) {
                        i2 = 50;
                        if (i7 > 50) {
                            i = i2;
                        } else {
                            i = i7;
                        }
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER;
                        if (i7 > 500) {
                            i = i2;
                        } else {
                            i = i7;
                        }
                    }
                    ybv ybvVar = qu80Var2.f192599e;
                    long j = qu80Var2.f192600f;
                    boolean z = i == 0;
                    long j2 = qu80Var2.f192604j;
                    Integer num = qu80Var2.f192601g;
                    ty80 ty80Var = new ty80(j, i, num != null ? num.intValue() : 0, j2, qu80Var2.f192606l, ybvVar, qu80Var2.f192596b, z, qu80Var2.f192603i);
                    sq80Var.f213037b = 1;
                    Object objEmit2 = this.f180212b.emit(ty80Var, sq80Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
