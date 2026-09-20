package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.BiConsumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class pd41 implements BiConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LinkedHashMap f176350a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f176351b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yc41 f176352c;

    public pd41(LinkedHashMap linkedHashMap, List list, yc41 yc41Var) {
        this.f176350a = linkedHashMap;
        this.f176351b = list;
        this.f176352c = yc41Var;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i;
        String str = (String) obj;
        ArrayList arrayList = new ArrayList();
        List list = this.f176352c.f271379a;
        int i2 = 0;
        for (Object obj3 : (List) obj2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h6f.m46722S();
                throw null;
            }
            ix51 ix51Var = (ix51) obj3;
            String str2 = ix51Var.f106600a;
            String str3 = ix51Var.f106601b;
            int i4 = 1;
            String str4 = bm51.m29796g0(str2, ".srt", true) ? "application/x-subrip" : "text/vtt";
            p300 p300Var = new p300();
            p300Var.f173513a = str3;
            p300Var.f173526n = def0.m35799p(str4);
            p300Var.f173516d = str3;
            p300Var.f173527o = def0.m35799p(str4);
            int i5 = ix51Var.f106602c ? 64 : 0;
            ex51 ex51Var = ix51Var.f106603d;
            if (ex51Var == ex51.f63676c) {
                i5 |= 16;
            }
            if (ex51Var == ex51.f63675b) {
                i5 |= 1;
            }
            p300Var.f173518f = i5;
            ArrayList arrayList2 = new ArrayList();
            sw51 sw51Var = ix51Var.f106604e;
            if (sw51Var != null) {
                int iOrdinal = sw51Var.ordinal();
                if (iOrdinal == 0) {
                    i = 1;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 2;
                }
                arrayList2.add(new tw51(i));
            }
            wv51 wv51Var = ix51Var.f106605f;
            if (wv51Var != null) {
                int iOrdinal2 = wv51Var.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i4 = 2;
                }
                arrayList2.add(new xv51(i4));
            }
            if (!arrayList2.isEmpty()) {
                p300Var.f173524l = new j6f0(arrayList2);
            }
            r300 r300Var = new r300(p300Var);
            String str5 = ix51Var.f106600a;
            arrayList.add(new bmr0(i2, r300Var, this.f176351b, str5, str5, ((dej) g6f.m43741q0(list)).f48099c / ((long) 1000), ((dej) g6f.m43741q0(list)).f48099c));
            i2 = i3;
        }
        this.f176350a.put(str, arrayList);
    }
}
