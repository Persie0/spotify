package p204p;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class tr50 extends njv0 {

    /* JADX INFO: renamed from: a */
    public final bdv f222979a;

    /* JADX INFO: renamed from: b */
    public final int f222980b;

    /* JADX INFO: renamed from: c */
    public final int f222981c;

    /* JADX INFO: renamed from: d */
    public int f222982d;

    public tr50(bdv bdvVar, int i) {
        this.f222979a = bdvVar;
        this.f222980b = i;
        this.f222981c = i / 2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0154  */
    /* JADX WARN: Code duplicated, block: B:101:0x0156  */
    /* JADX WARN: Code duplicated, block: B:103:0x015b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0163  */
    /* JADX WARN: Code duplicated, block: B:108:0x016a  */
    /* JADX WARN: Code duplicated, block: B:110:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0172  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
    /* JADX WARN: Code duplicated, block: B:80:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0115  */
    /* JADX WARN: Code duplicated, block: B:84:0x012a  */
    /* JADX WARN: Code duplicated, block: B:85:0x012c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0132  */
    /* JADX WARN: Code duplicated, block: B:91:0x0136  */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0148  */
    /* JADX WARN: Code duplicated, block: B:99:0x0152 A[DONT_INVERT] */
    @Override // p204p.njv0
    /* JADX INFO: renamed from: f */
    public final void mo24519f(Rect rect, View view, RecyclerView recyclerView, zjv0 zjv0Var) {
        boolean z;
        boolean z2;
        View view2;
        boolean zContains;
        int i;
        boolean zContains2;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        View view3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof vz10) {
            int i9 = ((vz10) layoutParams).f246359e;
            dkv0 dkv0VarM997T = recyclerView.m997T(view);
            int iM967R = RecyclerView.m967R(view);
            if (iM967R == -1) {
                iM967R = dkv0VarM997T != null ? dkv0VarM997T.f50042d : -1;
                z = true;
            } else {
                z = false;
            }
            Object tag = (dkv0VarM997T == null || (view3 = dkv0VarM997T.f50039a) == null) ? null : view3.getTag(R.id.your_library_insets_cache);
            if (iM967R != -1) {
                hjv0 adapter = recyclerView.getAdapter();
                int iMo1617e = adapter != null ? adapter.mo1617e() : 0;
                if (tag instanceof e5b) {
                    e5b e5bVar = (e5b) tag;
                    if ((e5bVar.f56330a == this.f222982d && e5bVar.f56331b == iM967R) || z) {
                        rect.set(e5bVar.f56332c);
                        return;
                    }
                }
                bdv bdvVar = this.f222979a;
                Set setM28856C = bdvVar.m28856C(iM967R);
                int i10 = iM967R - i9;
                Set setM28856C2 = bdvVar.m28856C(i10 - 1);
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                int i11 = gridLayoutManager != null ? gridLayoutManager.f1156f1 : 1;
                Set set = setM28856C2;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = false;
                            break;
                        } else if (((hxv) it.next()).f96320a) {
                            z2 = true;
                            break;
                        }
                    }
                } else {
                    z2 = false;
                    break;
                }
                Set set2 = setM28856C;
                if ((set2 instanceof Collection) && set2.isEmpty()) {
                    zContains = setM28856C.contains(hxv.CARD);
                    i = this.f222980b;
                    if (zContains) {
                        if (i10 + i11 >= iMo1617e) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (i9 >= 0) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        if (i > 0) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        if (i11 > i9) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        if (i9 == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int i12 = i11 - 1;
                        if (i9 == i12) {
                        }
                        rect.left = 0;
                        rect.right = 0;
                        i4 = i / i11;
                        i5 = i9 * i4;
                        i6 = (i12 - i9) * i4;
                        i7 = (i12 * i) / i11;
                        if (!z4) {
                            if (z4) {
                                rect.left = i;
                                rect.right = (i4 - i6) + i7;
                            } else if (z5) {
                                rect.left = (i4 - i5) + i7;
                                rect.right = i;
                            } else {
                                int i13 = i9 * i7;
                                int i14 = i9 * i;
                                rect.left = (((i4 - i5) + i6) - i13) + i14;
                                rect.right = ((((i4 + i5) - i6) + i13) - i14) + i7;
                            }
                        } else if (z4) {
                            rect.left = i;
                            rect.right = (i4 - i6) + i7;
                        } else if (z5) {
                            rect.left = (i4 - i5) + i7;
                            rect.right = i;
                        } else {
                            int i15 = i9 * i7;
                            int i16 = i9 * i;
                            rect.left = (((i4 - i5) + i6) - i15) + i16;
                            rect.right = ((((i4 + i5) - i6) + i15) - i16) + i7;
                        }
                        if (z2) {
                            i8 = 0;
                        } else {
                            i8 = i;
                        }
                        rect.top = i8;
                        rect.bottom = z3 ? 0 : i;
                    } else {
                        zContains2 = setM28856C.contains(hxv.ROW);
                        i2 = this.f222981c;
                        if (zContains2) {
                            if (z2) {
                                i3 = 0;
                            } else {
                                i3 = i2;
                            }
                            rect.set(0, i3, 0, i2);
                        } else if (setM28856C.contains(hxv.BANNER)) {
                            if (!setM28856C2.isEmpty()) {
                                i = i2;
                            }
                            rect.set(0, i, 0, 0);
                        } else {
                            rect.set(i, z2 ? 0 : i2, i, i2);
                        }
                    }
                } else {
                    Iterator it2 = set2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            zContains = setM28856C.contains(hxv.CARD);
                            i = this.f222980b;
                            if (zContains) {
                                if (i10 + i11 >= iMo1617e) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (i9 >= 0) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                if (i > 0) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                if (i11 > i9) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                if (i9 == 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                int i17 = i11 - 1;
                                z5 = i9 == i17;
                                rect.left = 0;
                                rect.right = 0;
                                i4 = i / i11;
                                i5 = i9 * i4;
                                i6 = (i17 - i9) * i4;
                                i7 = (i17 * i) / i11;
                                if (!z4 && z5) {
                                    int i18 = i4 + i;
                                    rect.left = i18;
                                    rect.right = i18;
                                } else if (z4) {
                                    rect.left = i;
                                    rect.right = (i4 - i6) + i7;
                                } else if (z5) {
                                    rect.left = (i4 - i5) + i7;
                                    rect.right = i;
                                } else {
                                    int i19 = i9 * i7;
                                    int i110 = i9 * i;
                                    rect.left = (((i4 - i5) + i6) - i19) + i110;
                                    rect.right = ((((i4 + i5) - i6) + i19) - i110) + i7;
                                }
                                if (z2) {
                                    i8 = 0;
                                } else {
                                    i8 = i;
                                }
                                rect.top = i8;
                                rect.bottom = z3 ? 0 : i;
                            } else {
                                zContains2 = setM28856C.contains(hxv.ROW);
                                i2 = this.f222981c;
                                if (zContains2) {
                                    if (z2) {
                                        i3 = 0;
                                    } else {
                                        i3 = i2;
                                    }
                                    rect.set(0, i3, 0, i2);
                                } else if (setM28856C.contains(hxv.BANNER)) {
                                    if (!setM28856C2.isEmpty()) {
                                        i = i2;
                                    }
                                    rect.set(0, i, 0, 0);
                                } else {
                                    rect.set(i, z2 ? 0 : i2, i, i2);
                                }
                            }
                        } else if (((hxv) it2.next()).f96320a) {
                        }
                    }
                }
                if (dkv0VarM997T == null || (view2 = dkv0VarM997T.f50039a) == null) {
                    return;
                }
                view2.setTag(R.id.your_library_insets_cache, new e5b(this.f222982d, iM967R, new Rect(rect)));
            }
        }
    }
}
