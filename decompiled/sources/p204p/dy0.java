package p204p;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import com.spotify.player.model.PlayerState;
import com.spotify.signup.signup.p150v2.proto.Error;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class dy0 implements Function, jjw0, b671 {

    /* JADX INFO: renamed from: a */
    public int f54136a;

    /* JADX INFO: renamed from: b */
    public final Object f54137b;

    /* JADX INFO: renamed from: c */
    public Object f54138c;

    /* JADX INFO: renamed from: d */
    public Object f54139d;

    /* JADX INFO: renamed from: e */
    public Object f54140e;

    /* JADX INFO: renamed from: f */
    public Object f54141f;

    public /* synthetic */ dy0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f54137b = obj;
        this.f54138c = obj2;
        this.f54139d = obj3;
        this.f54140e = obj4;
        this.f54141f = obj5;
        this.f54136a = i;
    }

    /* JADX INFO: renamed from: j */
    public static dy0 m37278j(Context context, int i) {
        wj50.m88275l("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, h1u0.f86750x);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListM88942q = wtg1.m88942q(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListM88942q2 = wtg1.m88942q(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListM88942q3 = wtg1.m88942q(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        dh01 dh01VarM74257d = dh01.m35957a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C2281q5(0)).m74257d();
        typedArrayObtainStyledAttributes.recycle();
        return new dy0(colorStateListM88942q, colorStateListM88942q2, colorStateListM88942q3, dimensionPixelSize, dh01VarM74257d, rect);
    }

    /* JADX INFO: renamed from: A */
    public void m37279A(String str) {
        ((u4l0) this.f54139d).m82360n(this.f54136a, str);
        lwr lwrVar = (lwr) this.f54140e;
        Scheduler scheduler = (Scheduler) this.f54137b;
        lwrVar.m60127a(g0b1.m43282x(q3d0.m72105o(scheduler), new t9u0(this, str, null, 1)).m23298o(scheduler).subscribe(new y1s0(this, 6), new u9u0(this, 1)));
    }

    /* JADX INFO: renamed from: B */
    public void m37280B(cy0 cy0Var) {
        urt0 urt0Var = (urt0) this.f54140e;
        ((ArrayList) this.f54139d).add(cy0Var);
        int i = cy0Var.f43126a;
        if (i == 1) {
            urt0Var.m83865h(cy0Var.f43127b, cy0Var.f43129d);
            return;
        }
        if (i == 2) {
            int i2 = cy0Var.f43127b;
            int i3 = cy0Var.f43129d;
            RecyclerView recyclerView = (RecyclerView) urt0Var.f233454b;
            recyclerView.m1004c0(i2, i3, false);
            recyclerView.f1197I1 = true;
            return;
        }
        if (i == 4) {
            urt0Var.m83864g(cy0Var.f43127b, cy0Var.f43129d, cy0Var.f43128c);
        } else if (i == 8) {
            urt0Var.m83866i(cy0Var.f43127b, cy0Var.f43129d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + cy0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0192  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:187:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0142  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0158  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x0169  */
    /* JADX WARN: Code duplicated, block: B:90:0x016b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0171  */
    /* JADX WARN: Code duplicated, block: B:95:0x017c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0187  */
    /* JADX INFO: renamed from: C */
    public void m37281C() {
        boolean z;
        byte b;
        cy0 cy0VarM37313z;
        int i;
        int i2;
        int i3;
        cy0 cy0VarM37313z2;
        boolean z2;
        boolean z3;
        Object obj;
        cy0 cy0Var;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        sgz sgzVar = (sgz) this.f54137b;
        urt0 urt0Var = (urt0) this.f54140e;
        k4k0 k4k0Var = (k4k0) this.f54141f;
        ArrayList arrayList = (ArrayList) this.f54138c;
        k4k0Var.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((cy0) arrayList.get(size)).f43126a == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            dy0 dy0Var = (dy0) k4k0Var.f119244b;
            sgz sgzVar2 = (sgz) dy0Var.f54137b;
            cy0 cy0Var2 = (cy0) arrayList.get(size);
            cy0 cy0Var3 = (cy0) arrayList.get(i12);
            int i13 = cy0Var3.f43126a;
            if (i13 == 1) {
                int i14 = cy0Var2.f43129d;
                int i15 = cy0Var3.f43127b;
                int i16 = i14 < i15 ? -1 : 0;
                int i17 = cy0Var2.f43127b;
                if (i17 < i15) {
                    i16++;
                }
                if (i15 <= i17) {
                    cy0Var2.f43127b = i17 + cy0Var3.f43129d;
                }
                int i18 = cy0Var3.f43127b;
                if (i18 <= i14) {
                    cy0Var2.f43129d = i14 + cy0Var3.f43129d;
                }
                cy0Var3.f43127b = i18 + i16;
                arrayList.set(size, cy0Var3);
                arrayList.set(i12, cy0Var2);
            } else if (i13 == 2) {
                int i19 = cy0Var2.f43127b;
                int i20 = cy0Var2.f43129d;
                if (i19 < i20) {
                    if (cy0Var3.f43127b == i19 && cy0Var3.f43129d == i20 - i19) {
                        z3 = true;
                        z2 = false;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (cy0Var3.f43127b == i20 + 1 && cy0Var3.f43129d == i19 - i20) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                int i21 = cy0Var3.f43127b;
                if (i20 < i21) {
                    cy0Var3.f43127b = i21 - 1;
                } else {
                    int i22 = cy0Var3.f43129d;
                    if (i20 < i21 + i22) {
                        cy0Var3.f43129d = i22 - 1;
                        cy0Var2.f43126a = 2;
                        cy0Var2.f43129d = 1;
                        if (cy0Var3.f43129d == 0) {
                            arrayList.remove(i12);
                            cy0Var3.f43128c = null;
                            sgzVar2.mo72407g(cy0Var3);
                        }
                    }
                }
                int i23 = cy0Var2.f43127b;
                int i24 = cy0Var3.f43127b;
                if (i23 <= i24) {
                    cy0Var3.f43127b = i24 + 1;
                } else {
                    int i25 = i24 + cy0Var3.f43129d;
                    if (i23 < i25) {
                        obj = null;
                        cy0 cy0VarM37313z3 = dy0Var.m37313z(2, i23 + 1, null, i25 - i23);
                        cy0Var3.f43129d = cy0Var2.f43127b - cy0Var3.f43127b;
                        cy0Var = cy0VarM37313z3;
                    }
                    if (z3) {
                        arrayList.set(size, cy0Var3);
                        arrayList.remove(i12);
                        cy0Var2.f43128c = obj;
                        sgzVar2.mo72407g(cy0Var2);
                    } else {
                        if (z2) {
                            if (cy0Var != null) {
                                i10 = cy0Var2.f43127b;
                                if (i10 > cy0Var.f43127b) {
                                    cy0Var2.f43127b = i10 - cy0Var.f43129d;
                                }
                                i11 = cy0Var2.f43129d;
                                if (i11 > cy0Var.f43127b) {
                                    cy0Var2.f43129d = i11 - cy0Var.f43129d;
                                }
                            }
                            i8 = cy0Var2.f43127b;
                            if (i8 > cy0Var3.f43127b) {
                                cy0Var2.f43127b = i8 - cy0Var3.f43129d;
                            }
                            i9 = cy0Var2.f43129d;
                            if (i9 > cy0Var3.f43127b) {
                                cy0Var2.f43129d = i9 - cy0Var3.f43129d;
                            }
                        } else {
                            if (cy0Var != null) {
                                i6 = cy0Var2.f43127b;
                                if (i6 >= cy0Var.f43127b) {
                                    cy0Var2.f43127b = i6 - cy0Var.f43129d;
                                }
                                i7 = cy0Var2.f43129d;
                                if (i7 >= cy0Var.f43127b) {
                                    cy0Var2.f43129d = i7 - cy0Var.f43129d;
                                }
                            }
                            i4 = cy0Var2.f43127b;
                            if (i4 >= cy0Var3.f43127b) {
                                cy0Var2.f43127b = i4 - cy0Var3.f43129d;
                            }
                            i5 = cy0Var2.f43129d;
                            if (i5 >= cy0Var3.f43127b) {
                                cy0Var2.f43129d = i5 - cy0Var3.f43129d;
                            }
                        }
                        arrayList.set(size, cy0Var3);
                        if (cy0Var2.f43127b != cy0Var2.f43129d) {
                            arrayList.set(i12, cy0Var2);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (cy0Var != null) {
                            arrayList.add(size, cy0Var);
                        }
                    }
                }
                obj = null;
                cy0Var = null;
                if (z3) {
                    arrayList.set(size, cy0Var3);
                    arrayList.remove(i12);
                    cy0Var2.f43128c = obj;
                    sgzVar2.mo72407g(cy0Var2);
                } else {
                    if (z2) {
                        if (cy0Var != null) {
                            i10 = cy0Var2.f43127b;
                            if (i10 > cy0Var.f43127b) {
                                cy0Var2.f43127b = i10 - cy0Var.f43129d;
                            }
                            i11 = cy0Var2.f43129d;
                            if (i11 > cy0Var.f43127b) {
                                cy0Var2.f43129d = i11 - cy0Var.f43129d;
                            }
                        }
                        i8 = cy0Var2.f43127b;
                        if (i8 > cy0Var3.f43127b) {
                            cy0Var2.f43127b = i8 - cy0Var3.f43129d;
                        }
                        i9 = cy0Var2.f43129d;
                        if (i9 > cy0Var3.f43127b) {
                            cy0Var2.f43129d = i9 - cy0Var3.f43129d;
                        }
                    } else {
                        if (cy0Var != null) {
                            i6 = cy0Var2.f43127b;
                            if (i6 >= cy0Var.f43127b) {
                                cy0Var2.f43127b = i6 - cy0Var.f43129d;
                            }
                            i7 = cy0Var2.f43129d;
                            if (i7 >= cy0Var.f43127b) {
                                cy0Var2.f43129d = i7 - cy0Var.f43129d;
                            }
                        }
                        i4 = cy0Var2.f43127b;
                        if (i4 >= cy0Var3.f43127b) {
                            cy0Var2.f43127b = i4 - cy0Var3.f43129d;
                        }
                        i5 = cy0Var2.f43129d;
                        if (i5 >= cy0Var3.f43127b) {
                            cy0Var2.f43129d = i5 - cy0Var3.f43129d;
                        }
                    }
                    arrayList.set(size, cy0Var3);
                    if (cy0Var2.f43127b != cy0Var2.f43129d) {
                        arrayList.set(i12, cy0Var2);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (cy0Var != null) {
                        arrayList.add(size, cy0Var);
                    }
                }
            } else if (i13 == 4) {
                int i26 = cy0Var2.f43129d;
                int i27 = cy0Var3.f43127b;
                if (i26 < i27) {
                    cy0Var3.f43127b = i27 - 1;
                } else {
                    int i28 = cy0Var3.f43129d;
                    if (i26 < i27 + i28) {
                        cy0Var3.f43129d = i28 - 1;
                        cy0VarM37313z = dy0Var.m37313z(4, cy0Var2.f43127b, cy0Var3.f43128c, 1);
                    }
                    i = cy0Var2.f43127b;
                    i2 = cy0Var3.f43127b;
                    if (i <= i2) {
                        cy0Var3.f43127b = i2 + 1;
                    } else {
                        i3 = i2 + cy0Var3.f43129d;
                        if (i < i3) {
                            int i29 = i3 - i;
                            cy0VarM37313z2 = dy0Var.m37313z(4, i + 1, cy0Var3.f43128c, i29);
                            cy0Var3.f43129d -= i29;
                        }
                        arrayList.set(i12, cy0Var2);
                        if (cy0Var3.f43129d > 0) {
                            arrayList.set(size, cy0Var3);
                        } else {
                            arrayList.remove(size);
                            cy0Var3.f43128c = null;
                            sgzVar2.mo72407g(cy0Var3);
                        }
                        if (cy0VarM37313z != null) {
                            arrayList.add(size, cy0VarM37313z);
                        }
                        if (cy0VarM37313z2 != null) {
                            arrayList.add(size, cy0VarM37313z2);
                        }
                    }
                    cy0VarM37313z2 = null;
                    arrayList.set(i12, cy0Var2);
                    if (cy0Var3.f43129d > 0) {
                        arrayList.set(size, cy0Var3);
                    } else {
                        arrayList.remove(size);
                        cy0Var3.f43128c = null;
                        sgzVar2.mo72407g(cy0Var3);
                    }
                    if (cy0VarM37313z != null) {
                        arrayList.add(size, cy0VarM37313z);
                    }
                    if (cy0VarM37313z2 != null) {
                        arrayList.add(size, cy0VarM37313z2);
                    }
                }
                cy0VarM37313z = null;
                i = cy0Var2.f43127b;
                i2 = cy0Var3.f43127b;
                if (i <= i2) {
                    cy0Var3.f43127b = i2 + 1;
                } else {
                    i3 = i2 + cy0Var3.f43129d;
                    if (i < i3) {
                        int i210 = i3 - i;
                        cy0VarM37313z2 = dy0Var.m37313z(4, i + 1, cy0Var3.f43128c, i210);
                        cy0Var3.f43129d -= i210;
                    }
                    arrayList.set(i12, cy0Var2);
                    if (cy0Var3.f43129d > 0) {
                        arrayList.set(size, cy0Var3);
                    } else {
                        arrayList.remove(size);
                        cy0Var3.f43128c = null;
                        sgzVar2.mo72407g(cy0Var3);
                    }
                    if (cy0VarM37313z != null) {
                        arrayList.add(size, cy0VarM37313z);
                    }
                    if (cy0VarM37313z2 != null) {
                        arrayList.add(size, cy0VarM37313z2);
                    }
                }
                cy0VarM37313z2 = null;
                arrayList.set(i12, cy0Var2);
                if (cy0Var3.f43129d > 0) {
                    arrayList.set(size, cy0Var3);
                } else {
                    arrayList.remove(size);
                    cy0Var3.f43128c = null;
                    sgzVar2.mo72407g(cy0Var3);
                }
                if (cy0VarM37313z != null) {
                    arrayList.add(size, cy0VarM37313z);
                }
                if (cy0VarM37313z2 != null) {
                    arrayList.add(size, cy0VarM37313z2);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            cy0 cy0VarM37313z4 = (cy0) arrayList.get(i30);
            int i31 = cy0VarM37313z4.f43126a;
            if (i31 == 1) {
                m37280B(cy0VarM37313z4);
            } else if (i31 == 2) {
                int i32 = cy0VarM37313z4.f43127b;
                int i33 = cy0VarM37313z4.f43129d + i32;
                int i34 = i32;
                int i35 = 0;
                byte b2 = -1;
                while (i34 < i33) {
                    if (urt0Var.m83863f(i34) != null || m37293e(i34)) {
                        if (b2 == 0) {
                            m37298k(m37313z(2, i32, null, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            m37280B(m37313z(2, i32, null, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    b2 = b;
                }
                if (i35 != cy0VarM37313z4.f43129d) {
                    cy0VarM37313z4.f43128c = null;
                    sgzVar.mo72407g(cy0VarM37313z4);
                    cy0VarM37313z4 = m37313z(2, i32, null, i35);
                }
                if (b2 == 0) {
                    m37298k(cy0VarM37313z4);
                } else {
                    m37280B(cy0VarM37313z4);
                }
            } else if (i31 == 4) {
                int i36 = cy0VarM37313z4.f43127b;
                int i37 = cy0VarM37313z4.f43129d + i36;
                int i38 = i36;
                int i39 = 0;
                byte b3 = -1;
                while (i36 < i37) {
                    if (urt0Var.m83863f(i36) != null || m37293e(i36)) {
                        if (b3 == 0) {
                            m37298k(m37313z(4, i38, cy0VarM37313z4.f43128c, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 1;
                    } else {
                        if (b3 == 1) {
                            m37280B(m37313z(4, i38, cy0VarM37313z4.f43128c, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != cy0VarM37313z4.f43129d) {
                    Object obj2 = cy0VarM37313z4.f43128c;
                    cy0VarM37313z4.f43128c = null;
                    sgzVar.mo72407g(cy0VarM37313z4);
                    cy0VarM37313z4 = m37313z(4, i38, obj2, i39);
                }
                if (b3 == 0) {
                    m37298k(cy0VarM37313z4);
                } else {
                    m37280B(cy0VarM37313z4);
                }
            } else if (i31 == 8) {
                m37280B(cy0VarM37313z4);
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: D */
    public void m37282D(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cy0 cy0Var = (cy0) arrayList.get(i);
            cy0Var.f43128c = null;
            ((sgz) this.f54137b).mo72407g(cy0Var);
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: E */
    public void m37283E() {
        m37282D((ArrayList) this.f54138c);
        m37282D((ArrayList) this.f54139d);
        this.f54136a = 0;
    }

    /* JADX INFO: renamed from: F */
    public void m37284F(Runnable runnable) {
        kh61 kh61Var = (kh61) this.f54137b;
        if (kh61Var.f122536a.getLooper().getThread().isAlive()) {
            kh61Var.m56388f(runnable);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m37285G(int i) {
        c95.m31855u(i >= 0);
        this.f54136a = i;
        m37302o(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: H */
    public Object m37286H(lu01 lu01Var, long j, nu71 nu71Var, String str, ibk ibkVar) {
        iv71 iv71Var;
        lu01 lu01Var2;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        long j2;
        dv71 dv71Var;
        long j3;
        if (ibkVar instanceof iv71) {
            iv71Var = (iv71) ibkVar;
            int i = iv71Var.f106168i;
            if ((i & Integer.MIN_VALUE) != 0) {
                iv71Var.f106168i = i - Integer.MIN_VALUE;
            } else {
                iv71Var = new iv71(this, ibkVar);
            }
        } else {
            iv71Var = new iv71(this, ibkVar);
        }
        Object objM55752a = iv71Var.f106166g;
        int i2 = iv71Var.f106168i;
        if (i2 == 0) {
            bga.m29073P(objM55752a);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(lu01Var.f136948c);
            hvi0 hvi0Var = cks.f39079b;
            long jM54450E = jwg1.m54450E(j, ils.MILLISECONDS);
            ils ilsVar = ils.SECONDS;
            long jM33199r = cks.m33199r(jM54450E, ilsVar);
            if (str != null) {
                return lu01.m59923c(lu01Var, str, opo.m67547D(linkedHashMap3), ((Context) this.f54141f).getString(R.string.podcast_clip_pre_url_text, ((fus0) this.f54140e).m42747d(nu71Var != null ? nu71Var.f158526a - j : cks.m33187f(jwg1.m54449D(this.f54136a, ilsVar)))), Error.INVALID_COUNTRY_FIELD_NUMBER);
            }
            dv71 dv71Var2 = (dv71) this.f54138c;
            k8n0 k8n0Var = (k8n0) this.f54137b;
            String str2 = lu01Var.f136946a;
            iv71Var.f106160a = lu01Var;
            iv71Var.f106161b = linkedHashMap3;
            iv71Var.f106162c = dv71Var2;
            iv71Var.f106163d = linkedHashMap3;
            iv71Var.f106164e = jM33199r;
            iv71Var.f106165f = jM33199r;
            iv71Var.f106168i = 1;
            objM55752a = k8n0Var.m55752a(jM33199r, str2, iv71Var);
            yuk yukVar = yuk.f276404a;
            if (objM55752a == yukVar) {
                return yukVar;
            }
            lu01Var2 = lu01Var;
            linkedHashMap = linkedHashMap3;
            linkedHashMap2 = linkedHashMap;
            j2 = jM33199r;
            dv71Var = dv71Var2;
            j3 = j2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = iv71Var.f106165f;
            j2 = iv71Var.f106164e;
            linkedHashMap = iv71Var.f106163d;
            dv71Var = iv71Var.f106162c;
            linkedHashMap2 = iv71Var.f106161b;
            lu01Var2 = iv71Var.f106160a;
            bga.m29073P(objM55752a);
        }
        dv71Var.getClass();
        dv71.m37047a(linkedHashMap, j3, (Long) objM55752a);
        return lu01.m59923c(lu01Var2, null, opo.m67547D(linkedHashMap2), ((kv71) this.f54139d).m57448a(String.valueOf(j2)), Error.TOO_YOUNG_FIELD_NUMBER);
    }

    /* JADX INFO: renamed from: I */
    public int m37287I(int i, int i2) {
        int i3;
        int i4;
        sgz sgzVar = (sgz) this.f54137b;
        ArrayList arrayList = (ArrayList) this.f54139d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            cy0 cy0Var = (cy0) arrayList.get(size);
            int i5 = cy0Var.f43126a;
            if (i5 == 8) {
                int i6 = cy0Var.f43127b;
                int i7 = cy0Var.f43129d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            cy0Var.f43127b = i6 + 1;
                            cy0Var.f43129d = i7 + 1;
                        } else if (i2 == 2) {
                            cy0Var.f43127b = i6 - 1;
                            cy0Var.f43129d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        cy0Var.f43129d = i7 + 1;
                    } else if (i2 == 2) {
                        cy0Var.f43129d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        cy0Var.f43127b = i6 + 1;
                    } else if (i2 == 2) {
                        cy0Var.f43127b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = cy0Var.f43127b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= cy0Var.f43129d;
                    } else if (i5 == 2) {
                        i += cy0Var.f43129d;
                    }
                } else if (i2 == 1) {
                    cy0Var.f43127b = i8 + 1;
                } else if (i2 == 2) {
                    cy0Var.f43127b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            cy0 cy0Var2 = (cy0) arrayList.get(size2);
            if (cy0Var2.f43126a == 8) {
                int i9 = cy0Var2.f43129d;
                if (i9 == cy0Var2.f43127b || i9 < 0) {
                    arrayList.remove(size2);
                    cy0Var2.f43128c = null;
                    sgzVar.mo72407g(cy0Var2);
                }
            } else if (cy0Var2.f43129d <= 0) {
                arrayList.remove(size2);
                cy0Var2.f43128c = null;
                sgzVar.mo72407g(cy0Var2);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: J */
    public void m37288J(Object obj) {
        Object obj2 = this.f54140e;
        this.f54140e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        gjx gjxVar = ((rix) this.f54139d).f199647b;
        ((Integer) obj2).getClass();
        int iIntValue = ((Integer) obj).intValue();
        gjxVar.m44996E1();
        gjxVar.f80624l.f189355g.m56385b(40, iIntValue, 0).m53364b();
        gjxVar.f80626m.m63839j(21, new vwo(iIntValue, 2));
    }

    /* JADX INFO: renamed from: K */
    public void m37289K() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(p8y.m69343a()).edit();
        Long l = (Long) this.f54137b;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l != null ? l.longValue() : 0L);
        Long l2 = (Long) this.f54138c;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l2 != null ? l2.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f54136a);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", ((UUID) this.f54139d).toString());
        editorEdit.apply();
        ezo ezoVar = (ezo) this.f54141f;
        if (ezoVar == null || ezoVar == null) {
            return;
        }
        SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(p8y.m69343a()).edit();
        editorEdit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", ezoVar.f64424c);
        editorEdit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", ezoVar.f64423b);
        editorEdit2.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r10 < r3.f252632b) goto L34;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m37290a(long j, l2n0 l2n0Var) {
        int i;
        ArrayDeque arrayDeque = (ArrayDeque) this.f54139d;
        PriorityQueue priorityQueue = (PriorityQueue) this.f54140e;
        if (j != -9223372036854775807L && (i = this.f54136a) != 0) {
            if (i != -1 && priorityQueue.size() >= this.f54136a) {
                wlw0 wlw0Var = (wlw0) priorityQueue.peek();
                String str = h0b1.f86200a;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.f54138c;
            l2n0 l2n0Var2 = arrayDeque2.isEmpty() ? new l2n0() : (l2n0) arrayDeque2.pop();
            l2n0Var2.m57927O(l2n0Var.m57932a());
            System.arraycopy(l2n0Var.f129054a, l2n0Var.f129055b, l2n0Var2.f129054a, 0, l2n0Var2.m57932a());
            wlw0 wlw0Var2 = (wlw0) this.f54141f;
            if (wlw0Var2 != null && j == wlw0Var2.f252632b) {
                wlw0Var2.f252631a.add(l2n0Var2);
                return;
            }
            wlw0 wlw0Var3 = arrayDeque.isEmpty() ? new wlw0() : (wlw0) arrayDeque.pop();
            ArrayList arrayList = wlw0Var3.f252631a;
            c95.m31843i(j != -9223372036854775807L);
            c95.m31855u(arrayList.isEmpty());
            wlw0Var3.f252632b = j;
            arrayList.add(l2n0Var2);
            priorityQueue.add(wlw0Var3);
            this.f54141f = wlw0Var3;
            int i2 = this.f54136a;
            if (i2 != -1) {
                m37302o(i2);
                return;
            }
            return;
        }
        ((xlw0) this.f54137b).mo71203c(j, l2n0Var);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return (playerState.isPlaying() && !playerState.isPaused() && wj50.m88271j((String) this.f54137b, playerState.contextUri())) ? CompletableEmpty.f7437a : ((nzb) this.f54138c).m45441s((String) this.f54139d, (String) this.f54140e, (Bundle) this.f54141f, this.f54136a, true);
    }

    /* JADX INFO: renamed from: b */
    public int m37291b(int i) {
        ArrayList arrayList = (ArrayList) this.f54138c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cy0 cy0Var = (cy0) arrayList.get(i2);
            int i3 = cy0Var.f43126a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = cy0Var.f43127b;
                    if (i4 <= i) {
                        int i5 = cy0Var.f43129d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = cy0Var.f43127b;
                    if (i6 == i) {
                        i = cy0Var.f43129d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (cy0Var.f43129d <= i) {
                            i++;
                        }
                    }
                }
            } else if (cy0Var.f43127b <= i) {
                i += cy0Var.f43129d;
            }
        }
        return i;
    }

    @Override // p204p.jjw0
    /* JADX INFO: renamed from: c */
    public void mo37292c() {
        ((kqi0) this.f54137b).setValue(Boolean.TRUE);
    }

    @Override // p204p.b671
    /* JADX INFO: renamed from: d */
    public void mo28282d(fyf fyfVar, xq00 xq00Var, int i) {
        dea1 dea1Var = (dea1) this.f54138c;
        xq00Var.m91775k0(1770094530);
        int i2 = i | (xq00Var.m91766g(this) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            String string = ((l971) this.f54137b).m58500d().f226935c.toString();
            p671.f174307a.m69189b(string, rkk.m75772x(-1016923791, new jsl0(string, dea1Var, fyfVar, (eh00) this.f54140e), xq00Var), true, false, pmr0.f179211W0, (voi0) this.f54139d, rkk.m75772x(2059366282, new llu0(this.f54136a, dea1Var, (if71) this.f54141f), xq00Var), null, null, null, bwy0.m30732g(xq00Var), dea1Var.f48046d, null, xq00Var, 100666800, 0, 163520);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gex0(this, fyfVar, i, 9);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m37293e(int i) {
        ArrayList arrayList = (ArrayList) this.f54139d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cy0 cy0Var = (cy0) arrayList.get(i2);
            int i3 = cy0Var.f43126a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = cy0Var.f43127b;
                    int i5 = cy0Var.f43129d + i4;
                    while (i4 < i5) {
                        if (m37301n(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m37301n(cy0Var.f43129d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p204p.jjw0
    /* JADX INFO: renamed from: f */
    public void mo37294f() {
        ((kqi0) this.f54137b).setValue(Boolean.FALSE);
    }

    @Override // p204p.jjw0
    /* JADX INFO: renamed from: g */
    public void mo37295g(boolean z) {
        ubl0 ubl0Var = (ubl0) this.f54139d;
        ((kqi0) this.f54137b).setValue(Boolean.FALSE);
        ((kqi0) this.f54141f).setValue(Boolean.valueOf(!z));
        if (z && ((z6l) this.f54138c).f279953g.containsKey(ubl0Var.f228817a.f178681a)) {
            ((gh00) this.f54140e).invoke(new v6l(this.f54136a, ubl0Var.f228817a));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m37296h() {
        ArrayList arrayList = (ArrayList) this.f54139d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((urt0) this.f54140e).m83862e((cy0) arrayList.get(i));
        }
        m37282D(arrayList);
        this.f54136a = 0;
    }

    /* JADX INFO: renamed from: i */
    public void m37297i() {
        urt0 urt0Var = (urt0) this.f54140e;
        m37296h();
        ArrayList arrayList = (ArrayList) this.f54138c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cy0 cy0Var = (cy0) arrayList.get(i);
            int i2 = cy0Var.f43126a;
            if (i2 == 1) {
                urt0Var.m83862e(cy0Var);
                urt0Var.m83865h(cy0Var.f43127b, cy0Var.f43129d);
            } else if (i2 == 2) {
                urt0Var.m83862e(cy0Var);
                int i3 = cy0Var.f43127b;
                int i4 = cy0Var.f43129d;
                RecyclerView recyclerView = (RecyclerView) urt0Var.f233454b;
                recyclerView.m1004c0(i3, i4, true);
                recyclerView.f1197I1 = true;
                recyclerView.f1194F1.f283546c += i4;
            } else if (i2 == 4) {
                urt0Var.m83862e(cy0Var);
                urt0Var.m83864g(cy0Var.f43127b, cy0Var.f43129d, cy0Var.f43128c);
            } else if (i2 == 8) {
                urt0Var.m83862e(cy0Var);
                urt0Var.m83866i(cy0Var.f43127b, cy0Var.f43129d);
            }
        }
        m37282D(arrayList);
        this.f54136a = 0;
    }

    /* JADX INFO: renamed from: k */
    public void m37298k(cy0 cy0Var) {
        int i;
        sgz sgzVar = (sgz) this.f54137b;
        int i2 = cy0Var.f43126a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM37287I = m37287I(cy0Var.f43127b, i2);
        int i3 = cy0Var.f43127b;
        int i4 = cy0Var.f43126a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + cy0Var);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < cy0Var.f43129d; i6++) {
            int iM37287I2 = m37287I((i * i6) + cy0Var.f43127b, cy0Var.f43126a);
            int i7 = cy0Var.f43126a;
            if (i7 == 2 ? iM37287I2 != iM37287I : !(i7 == 4 && iM37287I2 == iM37287I + 1)) {
                cy0 cy0VarM37313z = m37313z(i7, iM37287I, cy0Var.f43128c, i5);
                m37299l(cy0VarM37313z, i3);
                cy0VarM37313z.f43128c = null;
                sgzVar.mo72407g(cy0VarM37313z);
                if (cy0Var.f43126a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM37287I = iM37287I2;
            } else {
                i5++;
            }
        }
        Object obj = cy0Var.f43128c;
        cy0Var.f43128c = null;
        sgzVar.mo72407g(cy0Var);
        if (i5 > 0) {
            cy0 cy0VarM37313z2 = m37313z(cy0Var.f43126a, iM37287I, obj, i5);
            m37299l(cy0VarM37313z2, i3);
            cy0VarM37313z2.f43128c = null;
            sgzVar.mo72407g(cy0VarM37313z2);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m37299l(cy0 cy0Var, int i) {
        urt0 urt0Var = (urt0) this.f54140e;
        urt0Var.m83862e(cy0Var);
        int i2 = cy0Var.f43126a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            urt0Var.m83864g(i, cy0Var.f43129d, cy0Var.f43128c);
        } else {
            int i3 = cy0Var.f43129d;
            RecyclerView recyclerView = (RecyclerView) urt0Var.f233454b;
            recyclerView.m1004c0(i, i3, true);
            recyclerView.f1197I1 = true;
            recyclerView.f1194F1.f283546c += i3;
        }
    }

    /* JADX INFO: renamed from: m */
    public int m37300m(int i) {
        return m37301n(i, 0);
    }

    /* JADX INFO: renamed from: n */
    public int m37301n(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f54139d;
        int size = arrayList.size();
        while (i2 < size) {
            cy0 cy0Var = (cy0) arrayList.get(i2);
            int i3 = cy0Var.f43126a;
            if (i3 == 8) {
                int i4 = cy0Var.f43127b;
                if (i4 == i) {
                    i = cy0Var.f43129d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (cy0Var.f43129d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = cy0Var.f43127b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = cy0Var.f43129d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += cy0Var.f43129d;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: o */
    public void m37302o(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f54140e;
        while (priorityQueue.size() > i) {
            wlw0 wlw0Var = (wlw0) priorityQueue.poll();
            String str = h0b1.f86200a;
            int i2 = 0;
            while (true) {
                arrayList = wlw0Var.f252631a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((xlw0) this.f54137b).mo71203c(wlw0Var.f252632b, (l2n0) arrayList.get(i2));
                ((ArrayDeque) this.f54138c).push((l2n0) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            wlw0 wlw0Var2 = (wlw0) this.f54141f;
            if (wlw0Var2 != null && wlw0Var2.f252632b == wlw0Var.f252632b) {
                this.f54141f = null;
            }
            ((ArrayDeque) this.f54139d).push(wlw0Var);
        }
    }

    /* JADX INFO: renamed from: p */
    public Long m37303p() {
        Long l = (Long) this.f54140e;
        if (l == null) {
            return 0L;
        }
        return l;
    }

    /* JADX INFO: renamed from: q */
    public int m37304q() {
        return this.f54136a;
    }

    /* JADX INFO: renamed from: r */
    public AudioManager.OnAudioFocusChangeListener m37305r() {
        return (AudioManager.OnAudioFocusChangeListener) this.f54139d;
    }

    /* JADX INFO: renamed from: s */
    public Long m37306s() {
        return (Long) this.f54138c;
    }

    /* JADX INFO: renamed from: t */
    public long m37307t() {
        Long l;
        Long l2 = (Long) this.f54137b;
        if (l2 == null || (l = (Long) this.f54138c) == null) {
            return 0L;
        }
        if (l != null) {
            return l.longValue() - l2.longValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: renamed from: u */
    public ezo m37308u() {
        return (ezo) this.f54141f;
    }

    /* JADX INFO: renamed from: v */
    public s9u0 m37309v() {
        s9u0 s9u0Var = (s9u0) this.f54141f;
        if (s9u0Var != null) {
            return s9u0Var;
        }
        wj50.m88260d0("viewBinder");
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public boolean m37310w(int i) {
        return (i & this.f54136a) != 0;
    }

    /* JADX INFO: renamed from: x */
    public boolean m37311x() {
        return ((ArrayList) this.f54138c).size() > 0;
    }

    /* JADX INFO: renamed from: y */
    public boolean m37312y() {
        return (((ArrayList) this.f54139d).isEmpty() || ((ArrayList) this.f54138c).isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    public cy0 m37313z(int i, int i2, Object obj, int i3) {
        cy0 cy0Var = (cy0) ((sgz) this.f54137b).mo72406a();
        if (cy0Var != null) {
            cy0Var.f43126a = i;
            cy0Var.f43127b = i2;
            cy0Var.f43129d = i3;
            cy0Var.f43128c = obj;
            return cy0Var;
        }
        cy0 cy0Var2 = new cy0();
        cy0Var2.f43126a = i;
        cy0Var2.f43127b = i2;
        cy0Var2.f43129d = i3;
        cy0Var2.f43128c = obj;
        return cy0Var2;
    }

    public /* synthetic */ dy0(Object obj, Object obj2, Object obj3, ai00 ai00Var, int i, Object obj4) {
        this.f54137b = obj;
        this.f54138c = obj2;
        this.f54139d = obj3;
        this.f54140e = ai00Var;
        this.f54136a = i;
        this.f54141f = obj4;
    }

    public dy0(int i, Boolean bool, pgq0 pgq0Var, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, Boolean bool2) {
        this.f54136a = i;
        this.f54137b = bool;
        this.f54138c = pgq0Var;
        this.f54139d = onAudioFocusChangeListener;
        this.f54140e = handler;
        this.f54141f = bool2;
    }

    public dy0(Scheduler scheduler, bwt0 bwt0Var, u4l0 u4l0Var) {
        this.f54137b = scheduler;
        this.f54138c = bwt0Var;
        this.f54139d = u4l0Var;
        this.f54140e = new lwr();
    }

    public dy0(Long l, Long l2) {
        UUID uuidRandomUUID = UUID.randomUUID();
        this.f54137b = l;
        this.f54138c = l2;
        this.f54139d = uuidRandomUUID;
    }

    public dy0(xlw0 xlw0Var) {
        this.f54137b = xlw0Var;
        this.f54138c = new ArrayDeque();
        this.f54139d = new ArrayDeque();
        this.f54140e = new PriorityQueue();
        this.f54136a = -1;
    }

    public dy0(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, dh01 dh01Var, Rect rect) {
        wj50.m88278o(rect.left);
        wj50.m88278o(rect.top);
        wj50.m88278o(rect.right);
        wj50.m88278o(rect.bottom);
        this.f54137b = rect;
        this.f54138c = colorStateList2;
        this.f54139d = colorStateList;
        this.f54140e = colorStateList3;
        this.f54136a = i;
        this.f54141f = dh01Var;
    }

    public dy0(urt0 urt0Var) {
        this.f54137b = new sgz(30);
        this.f54138c = new ArrayList();
        this.f54139d = new ArrayList();
        this.f54136a = 0;
        this.f54140e = urt0Var;
        this.f54141f = new k4k0(this, 7);
    }

    public dy0(Object obj, Looper looper, Looper looper2, gh61 gh61Var, rix rixVar) {
        this.f54137b = gh61Var.m44723a(looper, null);
        this.f54138c = gh61Var.m44723a(looper2, null);
        this.f54140e = obj;
        this.f54141f = obj;
        this.f54139d = rixVar;
    }
}
