package p204p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.bluetooth.categorizer.BluetoothCategorizer;
import com.spotify.bluetooth.categorizer.CategorizerResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class z2q {

    /* JADX INFO: renamed from: a */
    public final Context f278637a;

    /* JADX INFO: renamed from: b */
    public final sx3 f278638b;

    /* JADX INFO: renamed from: c */
    public final cej0 f278639c;

    /* JADX INFO: renamed from: d */
    public final BluetoothCategorizer f278640d;

    /* JADX INFO: renamed from: e */
    public final luk f278641e;

    public z2q(Context context, sx3 sx3Var, cej0 cej0Var, BluetoothCategorizer bluetoothCategorizer, luk lukVar) {
        this.f278637a = context;
        this.f278638b = sx3Var;
        this.f278639c = cej0Var;
        this.f278640d = bluetoothCategorizer;
        this.f278641e = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0065 -> B:25:0x008a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0087 -> B:24:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m95230a(p204p.z2q r6, java.util.List r7, p204p.ibk r8) {
        /*
            boolean r0 = r8 instanceof p204p.x2q
            if (r0 == 0) goto L13
            r0 = r8
            p.x2q r0 = (p204p.x2q) r0
            int r1 = r0.f257547h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257547h = r1
            goto L18
        L13:
            p.x2q r0 = new p.x2q
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f257545f
            int r1 = r0.f257547h
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L33
            int r7 = r0.f257544e
            int r1 = r0.f257543d
            java.util.Collection r3 = r0.f257542c
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r4 = r0.f257541b
            java.util.Collection r5 = r0.f257540a
            java.util.Collection r5 = (java.util.Collection) r5
            p204p.bga.m29073P(r8)
            goto L88
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            p204p.bga.m29073P(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r1 = 10
            int r1 = p204p.i6f.m49804T(r7, r1)
            r8.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
            r1 = 0
            r4 = r7
            r3 = r8
            r7 = r1
        L51:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r4.next()
            p.l3a r8 = (p204p.l3a) r8
            p.ild0 r5 = r8.f129249a
            boolean r5 = p204p.aq7.m26756n(r5)
            if (r5 == 0) goto L6c
            r5 = 0
            p.kdc r8 = r6.m95232c(r8, r5)
            r5 = r3
            goto L8a
        L6c:
            r0.getClass()
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            r0.f257540a = r5
            r0.f257541b = r4
            r0.f257542c = r5
            r0.f257543d = r1
            r0.f257544e = r7
            r0.f257547h = r2
            java.lang.Object r8 = r6.m95231b(r8, r0)
            p.yuk r5 = p204p.yuk.f276404a
            if (r8 != r5) goto L87
            return r5
        L87:
            r5 = r3
        L88:
            p.kdc r8 = (p204p.kdc) r8
        L8a:
            r3.add(r8)
            r3 = r5
            goto L51
        L8f:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.z2q.m95230a(p.z2q, java.util.List, p.ibk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (p204p.qlk.m73247z(r0) == r4) goto L30;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m95231b(l3a l3aVar, ibk ibkVar) {
        y2q y2qVar;
        l3a l3aVar2;
        Exception e;
        CategorizerResponse categorizerResponse;
        if (ibkVar instanceof y2q) {
            y2qVar = (y2q) ibkVar;
            int i = y2qVar.f268662e;
            if ((i & Integer.MIN_VALUE) != 0) {
                y2qVar.f268662e = i - Integer.MIN_VALUE;
            } else {
                y2qVar = new y2q(this, ibkVar);
            }
        } else {
            y2qVar = new y2q(this, ibkVar);
        }
        Object objM86755t = y2qVar.f268660c;
        int i2 = y2qVar.f268662e;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM86755t);
                fiz fizVarCategorizeAndUpdateCaches = this.f278640d.categorizeAndUpdateCaches(l3aVar.f129249a.f103358b);
                y2qVar.f268658a = l3aVar;
                y2qVar.f268662e = 1;
                objM86755t = vyf1.m86755t(fizVarCategorizeAndUpdateCaches, y2qVar);
                if (objM86755t == yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                l3aVar = y2qVar.f268658a;
                bga.m29073P(objM86755t);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CategorizerResponse categorizerResponse2 = y2qVar.f268659b;
                l3aVar2 = y2qVar.f268658a;
                try {
                    bga.m29073P(objM86755t);
                    categorizerResponse = categorizerResponse2;
                    l3aVar = l3aVar2;
                } catch (Exception e2) {
                    e = e2;
                    Logger.m3967c(e, "Failed to categorize route: " + l3aVar2.f129249a, new Object[0]);
                    return m95232c(l3aVar2, null);
                }
            }
            return m95232c(l3aVar, categorizerResponse);
            categorizerResponse = (CategorizerResponse) objM86755t;
            y2qVar.f268658a = l3aVar;
            y2qVar.f268659b = categorizerResponse;
            y2qVar.f268662e = 2;
        } catch (Exception e3) {
            l3aVar2 = l3aVar;
            e = e3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0100  */
    /* JADX INFO: renamed from: c */
    public final kdc m95232c(l3a l3aVar, CategorizerResponse categorizerResponse) {
        gz9 gz9Var;
        BluetoothDevice bluetoothDevice;
        String category;
        ild0 ild0Var = l3aVar.f129249a;
        int i = ild0Var.f103360d;
        boolean zM26756n = aq7.m26756n(ild0Var);
        xfr xfrVar = xfr.f261081d;
        xfr xfrVar2 = xfr.f261080c;
        Context context = this.f278637a;
        String alias = null;
        if (zM26756n) {
            if (e0b1.m37490b(context)) {
                xfrVar = xfrVar2;
            }
            return new kdc(l3aVar, xfrVar, null);
        }
        String str = ild0Var.f103357a;
        if ((i == 26 || i == 8) && this.f278639c.m32585a()) {
            int length = str.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                if (str.charAt(i2) == ':') {
                    break;
                }
                i2++;
            }
            String strSubstring = str.substring(i2 + 1);
            BluetoothAdapter bluetoothAdapter = this.f278638b.f214795a;
            if (bluetoothAdapter == null || !BluetoothAdapter.checkBluetoothAddress(strSubstring)) {
                gz9Var = null;
            } else {
                gz9Var = new gz9(bluetoothAdapter.getRemoteDevice(strSubstring));
            }
        } else {
            gz9Var = null;
        }
        int i3 = 4;
        xfr xfrVar3 = xfr.f261067P0;
        xfr xfrVar4 = xfr.f261078a;
        xfr xfrVar5 = xfr.f261068Q0;
        if (i == 0) {
            xfrVar = xfrVar4;
        } else if (i != 26) {
            xfr xfrVar6 = xfr.f261082e;
            if (i == 2000) {
                xfrVar = xfrVar6;
            } else if (i != 2) {
                if (i == 3 || i == 4) {
                    xfrVar = xfrVar5;
                } else if (i != 8) {
                    xfrVar = xfr.f261083f;
                    if (i != 9) {
                        if (i != 22 && i != 23) {
                            switch (i) {
                                case 11:
                                case 12:
                                    xfrVar = xfrVar5;
                                    break;
                                case 13:
                                    xfrVar = xfrVar6;
                                    break;
                                default:
                                    switch (i) {
                                        case 1001:
                                            break;
                                        case 1002:
                                            xfrVar = xfrVar3;
                                            break;
                                        case 1003:
                                            xfrVar = xfr.f261084g;
                                            break;
                                        default:
                                            xfrVar = xfrVar4;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            xfrVar = xfrVar5;
                        }
                    }
                } else {
                    xfrVar = xfrVar3;
                }
            } else if (e0b1.m37490b(context)) {
                xfrVar = xfrVar2;
            }
        } else {
            xfrVar = xfrVar5;
        }
        if (categorizerResponse == null || (category = categorizerResponse.getCategory()) == null) {
            xfrVar3 = null;
        } else {
            if (category.equals("app")) {
                i3 = 1;
            } else if (category.equals("car")) {
                i3 = 2;
            } else if (category.equals("headphones")) {
                i3 = 3;
            } else if (!category.equals("speaker")) {
                if (category.equals("wearable")) {
                    i3 = 5;
                } else {
                    i3 = category.equals("face_wearable") ? 6 : 7;
                }
            }
            int iM38547C = edb.m38547C(i3);
            if (iM38547C == 1) {
                xfrVar3 = xfr.f261071T0;
            } else if (iM38547C == 2) {
                xfrVar3 = xfrVar5;
            } else if (iM38547C != 3) {
                xfrVar3 = null;
            }
        }
        if (xfrVar3 != null) {
            xfrVar = xfrVar3;
        }
        if (gz9Var != null && (bluetoothDevice = gz9Var.f85869a) != null) {
            alias = bluetoothDevice.getAlias();
        }
        return new kdc(l3aVar, xfrVar, alias);
    }
}
