package p204p;

import com.spotify.mobius.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class rry0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f202136a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f202137b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f202138c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f202139d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f202140e;

    public /* synthetic */ rry0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f202136a = i;
        this.f202137b = obj;
        this.f202138c = obj2;
        this.f202139d = obj3;
        this.f202140e = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r1.emit(r15, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        if (r1.emit(r15, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        return r4;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m76308b(int[] iArr, fbk fbkVar) {
        wj91 wj91Var;
        String[] strArr = (String[]) this.f202139d;
        niz nizVar = (niz) this.f202137b;
        rlv0 rlv0Var = (rlv0) this.f202138c;
        if (fbkVar instanceof wj91) {
            wj91Var = (wj91) fbkVar;
            int i = wj91Var.f251920d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wj91Var.f251920d = i - Integer.MIN_VALUE;
            } else {
                wj91Var = new wj91(this, fbkVar);
            }
        } else {
            wj91Var = new wj91(this, fbkVar);
        }
        Object obj = wj91Var.f251918b;
        int i2 = wj91Var.f251920d;
        if (i2 == 0) {
            bga.m29073P(obj);
            Object obj2 = rlv0Var.f200373a;
            yuk yukVar = yuk.f276404a;
            if (obj2 == null) {
                Set setM29624m1 = bk5.m29624m1(strArr);
                wj91Var.f251917a = iArr;
                wj91Var.f251920d = 1;
            } else {
                int[] iArr2 = (int[]) this.f202140e;
                ArrayList arrayList = new ArrayList();
                int length = strArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    String str = strArr[i3];
                    int i5 = i4 + 1;
                    Object obj3 = rlv0Var.f200373a;
                    if (obj3 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    int i6 = iArr2[i4];
                    if (((int[]) obj3)[i6] != iArr[i6]) {
                        arrayList.add(str);
                    }
                    i3++;
                    i4 = i5;
                }
                if (!arrayList.isEmpty()) {
                    Set setM43736n1 = g6f.m43736n1(arrayList);
                    wj91Var.f251917a = iArr;
                    wj91Var.f251920d = 2;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iArr = wj91Var.f251917a;
            bga.m29073P(obj);
        }
        rlv0Var.f200373a = iArr;
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:40:0x011e  */
    /* JADX WARN: Code duplicated, block: B:61:0x019b  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:92:0x021f  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        qry0 qry0Var;
        Object vsy0Var;
        or21 or21VarM67688b;
        pqm0 pqm0Var;
        or21 or21VarM67688b2;
        b450 b450Var;
        int i;
        int iM38547C;
        pqm0 pqm0Var2;
        int i2 = this.f202136a;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f202138c;
        Object obj3 = this.f202137b;
        Object obj4 = this.f202140e;
        Object obj5 = this.f202139d;
        switch (i2) {
            case 0:
                String str = (String) obj2;
                if (fbkVar instanceof qry0) {
                    qry0Var = (qry0) fbkVar;
                    int i3 = qry0Var.f191926b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qry0Var.f191926b = i3 - Integer.MIN_VALUE;
                    } else {
                        qry0Var = new qry0(this, fbkVar);
                    }
                } else {
                    qry0Var = new qry0(this, fbkVar);
                }
                Object obj6 = qry0Var.f191925a;
                int i4 = qry0Var.f191926b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj6);
                    return w2a1Var;
                }
                bga.m29073P(obj6);
                niz nizVar = (niz) obj3;
                Object obj7 = ((s6x0) obj).f206218a;
                List list = (List) (obj7 instanceof c6x0 ? null : obj7);
                if (list == null) {
                    vsy0Var = new vsy0(str);
                } else if (((ery0) obj5).f62224b || !((ay3) ((px0) obj4).f182174b).m27495k()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        j6f.m52564V(((kxb) it.next()).getItems(), arrayList);
                    }
                    vsy0Var = new ysy0(str, arrayList);
                } else {
                    vsy0Var = new zsy0(str, list);
                }
                qry0Var.f191926b = 1;
                Object objEmit = nizVar.emit(vsy0Var, qry0Var);
                yuk yukVar = yuk.f276404a;
                return objEmit == yukVar ? yukVar : w2a1Var;
            case 1:
                return m76308b((int[]) obj, fbkVar);
            case 2:
                pqm0 pqm0Var3 = (pqm0) obj;
                gr91 gr91Var = (gr91) obj2;
                vum0 vum0Var = (vum0) obj4;
                int iIntValue = ((Number) pqm0Var3.f180350a).intValue();
                tw70 tw70Var = (tw70) g6f.m43689C0((List) pqm0Var3.f180351b);
                int i5 = tw70Var != null ? tw70Var.f224325a : iIntValue;
                t9y0 t9y0Var = cr91.f41242a;
                int i6 = iIntValue >= vum0Var.m86437v() ? 1 : 2;
                vum0Var.m86438w(iIntValue);
                b450 b450VarM45475a = gr91Var.m45475a();
                b450 b450Var2 = new b450(iIntValue, i5, 1);
                tr21 tr21Var = (tr21) ((skp) obj3).f210178b;
                or21 or21Var = new or21(b450VarM45475a, tr21Var);
                int iM38547C2 = edb.m38547C(i6);
                int i7 = b450Var2.f278779b;
                int i8 = b450Var2.f278778a;
                tr21 tr21Var2 = or21Var.f168429b;
                b450 b450Var3 = or21Var.f168428a;
                if (iM38547C2 != 0) {
                    if (iM38547C2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (i8 - b450Var3.f278778a > ((int) Math.floor(tr21Var2.f222950a * tr21Var2.f222951b)) || b450Var3.f278778a <= 0) {
                        or21VarM67688b = null;
                    } else {
                        i = tr21Var2.f222952c;
                        iM38547C = edb.m38547C(i6);
                        if (iM38547C != 0) {
                            pqm0Var2 = new pqm0(Integer.valueOf(b450Var3.f278778a + i), Integer.valueOf(b450Var3.f278779b + i));
                        } else {
                            if (iM38547C == 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            pqm0Var2 = new pqm0(Integer.valueOf(b450Var3.f278778a - i), Integer.valueOf(b450Var3.f278779b - i));
                        }
                        or21VarM67688b = or21Var.m67688b(((Number) pqm0Var2.f180350a).intValue(), ((Number) pqm0Var2.f180351b).intValue(), b450Var2, i6);
                    }
                } else if (b450Var3.f278779b - i7 <= ((int) Math.floor(tr21Var2.f222950a * tr21Var2.f222951b))) {
                    i = tr21Var2.f222952c;
                    iM38547C = edb.m38547C(i6);
                    if (iM38547C != 0) {
                        pqm0Var2 = new pqm0(Integer.valueOf(b450Var3.f278778a + i), Integer.valueOf(b450Var3.f278779b + i));
                    } else {
                        if (iM38547C == 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pqm0Var2 = new pqm0(Integer.valueOf(b450Var3.f278778a - i), Integer.valueOf(b450Var3.f278779b - i));
                    }
                    or21VarM67688b = or21Var.m67688b(((Number) pqm0Var2.f180350a).intValue(), ((Number) pqm0Var2.f180351b).intValue(), b450Var2, i6);
                } else {
                    or21VarM67688b = null;
                }
                if (or21VarM67688b != null) {
                    or21Var = or21VarM67688b;
                }
                or21Var.getClass();
                int iMax = Math.max(or21Var.f168429b.f222950a, (i7 - i8) + 1);
                int iM38547C3 = edb.m38547C(i6);
                if (iM38547C3 == 0) {
                    int iMax2 = Math.max(0, (i7 + 1) - iMax);
                    pqm0Var = new pqm0(Integer.valueOf(iMax2), Integer.valueOf((iMax + iMax2) - 1));
                } else {
                    if (iM38547C3 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i9 = (i8 + iMax) - 1;
                    pqm0Var = new pqm0(Integer.valueOf(Math.max(0, (i9 - iMax) + 1)), Integer.valueOf(i9));
                }
                int iIntValue2 = ((Number) pqm0Var.f180350a).intValue();
                int iIntValue3 = ((Number) pqm0Var.f180351b).intValue();
                b450 b450Var4 = or21Var.f168428a;
                int iM38547C4 = edb.m38547C(i6);
                if (iM38547C4 != 0) {
                    if (iM38547C4 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (iIntValue3 < b450Var4.f278779b) {
                        or21VarM67688b2 = or21Var.m67688b(iIntValue2, iIntValue3, b450Var2, i6);
                    } else {
                        or21VarM67688b2 = null;
                    }
                } else if (iIntValue2 > b450Var4.f278778a) {
                    or21VarM67688b2 = or21Var.m67688b(iIntValue2, iIntValue3, b450Var2, i6);
                } else {
                    or21VarM67688b2 = null;
                }
                if (or21VarM67688b2 != null) {
                    or21Var = or21VarM67688b2;
                }
                if (b450Var2.isEmpty()) {
                    b450Var = or21Var.m67687a();
                } else {
                    b450 b450VarM67687a = or21Var.m67687a();
                    int i10 = tr21Var.f222950a;
                    int i11 = b450VarM67687a.f278778a;
                    int i12 = b450VarM67687a.f278779b;
                    int iMin = Math.min(i11, i8);
                    int iMax3 = Math.max(i12, i7);
                    int iMax4 = Math.max(0, iMin);
                    int i13 = (iMax3 - iMax4) + 1;
                    if (i13 < i10) {
                        int i14 = i10 - i13;
                        int iM38547C5 = edb.m38547C(i6);
                        if (iM38547C5 == 0) {
                            iMax3 += i14;
                        } else {
                            if (iM38547C5 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int iMin2 = Math.min(i14, iMax4);
                            iMax4 -= iMin2;
                            iMax3 += i14 - iMin2;
                        }
                    }
                    b450Var = new b450(iMax4, iMax3, 1);
                }
                b450 b450Var5 = wj50.m88271j(b450Var, b450VarM45475a) ? null : b450Var;
                if (b450Var5 != null) {
                    gr91Var.f83687a.setValue(b450Var5);
                    ((ar91) obj5).mo26929k(b450Var5);
                }
                return w2a1Var;
            default:
                int iIntValue4 = ((Number) obj).intValue();
                vum0 vum0Var2 = (vum0) obj5;
                if (iIntValue4 >= 0) {
                    if (iIntValue4 != vum0Var2.m86437v()) {
                        ((eh00) ((kqi0) obj4).getValue()).invoke();
                        vum0Var2.m86438w(iIntValue4);
                    }
                    zhq zhqVar = ((idd1) obj3).f101074f;
                    xre xreVar = zhqVar.f283001a;
                    zhqVar.f283002b = Long.valueOf(System.currentTimeMillis());
                    ((Consumer) obj2).accept(new oor(iIntValue4));
                }
                return w2a1Var;
        }
    }

    public rry0(rlv0 rlv0Var, niz nizVar, String[] strArr, int[] iArr) {
        this.f202136a = 1;
        this.f202138c = rlv0Var;
        this.f202137b = nizVar;
        this.f202139d = strArr;
        this.f202140e = iArr;
    }
}
