package p204p;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g0b1 {

    /* JADX INFO: renamed from: a */
    public static c0b1 f75327a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f75328b = false;

    /* JADX INFO: renamed from: c */
    public static final rgx f75329c = new rgx();

    /* JADX INFO: renamed from: d */
    public static final char[] f75330d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: e */
    public static sd40 f75331e;

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:76:0x0101  */
    /* JADX WARN: Code duplicated, block: B:78:0x0109  */
    /* JADX WARN: Code duplicated, block: B:80:0x0128  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0140  */
    /* JADX WARN: Code duplicated, block: B:86:0x0147  */
    /* JADX WARN: Code duplicated, block: B:88:0x014c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0169  */
    /* JADX WARN: Code duplicated, block: B:94:0x016d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0179  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m43260a(gh00 gh00Var, fxh0 fxh0Var, gh00 gh00Var2, gh00 gh00Var3, gh00 gh00Var4, xq00 xq00Var, int i, int i2) {
        int i3;
        fxh0 fxh0Var2;
        int i4;
        Object obj;
        int i5;
        int i6;
        Object obj2;
        int i7;
        int i8;
        Object obj3;
        int i9;
        boolean z;
        fxh0 fxh0Var3;
        Object obj4;
        Object obj5;
        Object obj6;
        pgv0 pgv0VarM91796v;
        Object obj7;
        int iHashCode;
        fxh0 fxh0VarM48286s;
        yqq yqqVar;
        ko70 ko70Var;
        int i10;
        wpn0 wpn0VarM91778m;
        hc80 hc80Var;
        h9y0 h9y0Var;
        eh00 eh00VarM43272n;
        eh00 eh00VarM43272n2;
        C2054kj c2054kj = C2054kj.f123184g;
        xq00Var.m91775k0(-180024211);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(gh00Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                fxh0Var2 = fxh0Var;
                i3 |= xq00Var.m91766g(fxh0Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    obj = gh00Var2;
                    if (xq00Var.m91770i(obj)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        obj2 = gh00Var3;
                        if (xq00Var.m91770i(obj2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 16;
                    if (i8 != 0) {
                        if ((i & 24576) == 0) {
                            obj3 = gh00Var4;
                            if (xq00Var.m91770i(obj3)) {
                                i9 = 16384;
                            } else {
                                i9 = 8192;
                            }
                            i3 |= i9;
                        }
                        if ((i3 & 9363) != 9362) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (xq00Var.m91752Y(i3 & 1, z)) {
                            if (i11 != 0) {
                                fxh0Var3 = cxh0.f43038a;
                            } else {
                                fxh0Var3 = fxh0Var2;
                            }
                            if (i4 != 0) {
                                obj7 = null;
                            } else {
                                obj7 = obj;
                            }
                            if (i6 != 0) {
                                obj2 = c2054kj;
                            }
                            if (i8 != 0) {
                                obj3 = c2054kj;
                            }
                            iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                            fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                            yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                            ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                            i10 = i3;
                            wpn0VarM91778m = xq00Var.m91778m();
                            hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                            h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                            if (obj7 != null) {
                                xq00Var.m91771i0(1313917368);
                                eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                                if (ug5Var instanceof kx91) {
                                    pmg1.m70360s();
                                    throw null;
                                }
                                xq00Var.m91779m0();
                                if (xq00Var.f264808S) {
                                    xq00Var.m91776l(eh00VarM43272n2);
                                } else {
                                    xq00Var.m91799w0();
                                }
                                m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                                zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                                zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                                zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                                xq00Var.m91788r(true);
                                xq00Var.m91788r(false);
                            } else {
                                xq00Var.m91771i0(1314774735);
                                eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                                if (ug5Var instanceof kx91) {
                                    pmg1.m70360s();
                                    throw null;
                                }
                                xq00Var.m91767g0();
                                if (xq00Var.f264808S) {
                                    xq00Var.m91776l(eh00VarM43272n);
                                } else {
                                    xq00Var.m91799w0();
                                }
                                m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                                zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                                zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                                xq00Var.m91788r(true);
                                xq00Var.m91788r(false);
                            }
                            obj4 = obj7;
                        } else {
                            xq00Var.m91757b0();
                            fxh0Var3 = fxh0Var2;
                            obj4 = obj;
                        }
                        obj5 = obj2;
                        obj6 = obj3;
                        pgv0VarM91796v = xq00Var.m91796v();
                        if (pgv0VarM91796v != null) {
                            pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
                        }
                    }
                    i3 |= 24576;
                    obj3 = gh00Var4;
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (xq00Var.m91752Y(i3 & 1, z)) {
                        if (i11 != 0) {
                            fxh0Var3 = cxh0.f43038a;
                        } else {
                            fxh0Var3 = fxh0Var2;
                        }
                        if (i4 != 0) {
                            obj7 = null;
                        } else {
                            obj7 = obj;
                        }
                        if (i6 != 0) {
                            obj2 = c2054kj;
                        }
                        if (i8 != 0) {
                            obj3 = c2054kj;
                        }
                        iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                        fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                        yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                        ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                        i10 = i3;
                        wpn0VarM91778m = xq00Var.m91778m();
                        hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                        h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                        if (obj7 != null) {
                            xq00Var.m91771i0(1313917368);
                            eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                            if (ug5Var instanceof kx91) {
                                pmg1.m70360s();
                                throw null;
                            }
                            xq00Var.m91779m0();
                            if (xq00Var.f264808S) {
                                xq00Var.m91776l(eh00VarM43272n2);
                            } else {
                                xq00Var.m91799w0();
                            }
                            m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                            zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                            zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                            zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                            xq00Var.m91788r(true);
                            xq00Var.m91788r(false);
                        } else {
                            xq00Var.m91771i0(1314774735);
                            eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                            if (ug5Var instanceof kx91) {
                                pmg1.m70360s();
                                throw null;
                            }
                            xq00Var.m91767g0();
                            if (xq00Var.f264808S) {
                                xq00Var.m91776l(eh00VarM43272n);
                            } else {
                                xq00Var.m91799w0();
                            }
                            m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                            zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                            zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                            xq00Var.m91788r(true);
                            xq00Var.m91788r(false);
                        }
                        obj4 = obj7;
                    } else {
                        xq00Var.m91757b0();
                        fxh0Var3 = fxh0Var2;
                        obj4 = obj;
                    }
                    obj5 = obj2;
                    obj6 = obj3;
                    pgv0VarM91796v = xq00Var.m91796v();
                    if (pgv0VarM91796v != null) {
                        pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
                    }
                }
                i3 |= 3072;
                obj2 = gh00Var3;
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        obj3 = gh00Var4;
                        if (xq00Var.m91770i(obj3)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (xq00Var.m91752Y(i3 & 1, z)) {
                        if (i11 != 0) {
                            fxh0Var3 = cxh0.f43038a;
                        } else {
                            fxh0Var3 = fxh0Var2;
                        }
                        if (i4 != 0) {
                            obj7 = null;
                        } else {
                            obj7 = obj;
                        }
                        if (i6 != 0) {
                            obj2 = c2054kj;
                        }
                        if (i8 != 0) {
                            obj3 = c2054kj;
                        }
                        iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                        fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                        yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                        ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                        i10 = i3;
                        wpn0VarM91778m = xq00Var.m91778m();
                        hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                        h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                        if (obj7 != null) {
                            xq00Var.m91771i0(1313917368);
                            eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                            if (ug5Var instanceof kx91) {
                                pmg1.m70360s();
                                throw null;
                            }
                            xq00Var.m91779m0();
                            if (xq00Var.f264808S) {
                                xq00Var.m91776l(eh00VarM43272n2);
                            } else {
                                xq00Var.m91799w0();
                            }
                            m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                            zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                            zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                            zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                            xq00Var.m91788r(true);
                            xq00Var.m91788r(false);
                        } else {
                            xq00Var.m91771i0(1314774735);
                            eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                            if (ug5Var instanceof kx91) {
                                pmg1.m70360s();
                                throw null;
                            }
                            xq00Var.m91767g0();
                            if (xq00Var.f264808S) {
                                xq00Var.m91776l(eh00VarM43272n);
                            } else {
                                xq00Var.m91799w0();
                            }
                            m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                            zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                            zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                            xq00Var.m91788r(true);
                            xq00Var.m91788r(false);
                        }
                        obj4 = obj7;
                    } else {
                        xq00Var.m91757b0();
                        fxh0Var3 = fxh0Var2;
                        obj4 = obj;
                    }
                    obj5 = obj2;
                    obj6 = obj3;
                    pgv0VarM91796v = xq00Var.m91796v();
                    if (pgv0VarM91796v != null) {
                        pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
                    }
                }
                i3 |= 24576;
                obj3 = gh00Var4;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z)) {
                    if (i11 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if (i4 != 0) {
                        obj7 = null;
                    } else {
                        obj7 = obj;
                    }
                    if (i6 != 0) {
                        obj2 = c2054kj;
                    }
                    if (i8 != 0) {
                        obj3 = c2054kj;
                    }
                    iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                    fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                    yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                    ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                    i10 = i3;
                    wpn0VarM91778m = xq00Var.m91778m();
                    hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                    h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                    if (obj7 != null) {
                        xq00Var.m91771i0(1313917368);
                        eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                        if (ug5Var instanceof kx91) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var.m91779m0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00VarM43272n2);
                        } else {
                            xq00Var.m91799w0();
                        }
                        m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                        zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                        zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                        zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                        xq00Var.m91788r(true);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(1314774735);
                        eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                        if (ug5Var instanceof kx91) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var.m91767g0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00VarM43272n);
                        } else {
                            xq00Var.m91799w0();
                        }
                        m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                        zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                        zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                        xq00Var.m91788r(true);
                        xq00Var.m91788r(false);
                    }
                    obj4 = obj7;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    obj4 = obj;
                }
                obj5 = obj2;
                obj6 = obj3;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
                }
            }
            i3 |= 384;
            obj = gh00Var2;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    obj2 = gh00Var3;
                    if (xq00Var.m91770i(obj2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        obj3 = gh00Var4;
                        if (xq00Var.m91770i(obj3)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (xq00Var.m91752Y(i3 & 1, z)) {
                        if (i11 != 0) {
                            fxh0Var3 = cxh0.f43038a;
                        } else {
                            fxh0Var3 = fxh0Var2;
                        }
                        if (i4 != 0) {
                            obj7 = null;
                        } else {
                            obj7 = obj;
                        }
                        if (i6 != 0) {
                            obj2 = c2054kj;
                        }
                        if (i8 != 0) {
                            obj3 = c2054kj;
                        }
                        iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                        fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                        yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                        ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                        i10 = i3;
                        wpn0VarM91778m = xq00Var.m91778m();
                        hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                        h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                        if (obj7 != null) {
                            xq00Var.m91771i0(1313917368);
                            eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                            if (ug5Var instanceof kx91) {
                                pmg1.m70360s();
                                throw null;
                            }
                            xq00Var.m91779m0();
                            if (xq00Var.f264808S) {
                                xq00Var.m91776l(eh00VarM43272n2);
                            } else {
                                xq00Var.m91799w0();
                            }
                            m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                            zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                            zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                            zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                            xq00Var.m91788r(true);
                            xq00Var.m91788r(false);
                        } else {
                            xq00Var.m91771i0(1314774735);
                            eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                            if (ug5Var instanceof kx91) {
                                pmg1.m70360s();
                                throw null;
                            }
                            xq00Var.m91767g0();
                            if (xq00Var.f264808S) {
                                xq00Var.m91776l(eh00VarM43272n);
                            } else {
                                xq00Var.m91799w0();
                            }
                            m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                            zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                            zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                            xq00Var.m91788r(true);
                            xq00Var.m91788r(false);
                        }
                        obj4 = obj7;
                    } else {
                        xq00Var.m91757b0();
                        fxh0Var3 = fxh0Var2;
                        obj4 = obj;
                    }
                    obj5 = obj2;
                    obj6 = obj3;
                    pgv0VarM91796v = xq00Var.m91796v();
                    if (pgv0VarM91796v != null) {
                        pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
                    }
                }
                i3 |= 24576;
                obj3 = gh00Var4;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z)) {
                    if (i11 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if (i4 != 0) {
                        obj7 = null;
                    } else {
                        obj7 = obj;
                    }
                    if (i6 != 0) {
                        obj2 = c2054kj;
                    }
                    if (i8 != 0) {
                        obj3 = c2054kj;
                    }
                    iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                    fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                    yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                    ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                    i10 = i3;
                    wpn0VarM91778m = xq00Var.m91778m();
                    hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                    h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                    if (obj7 != null) {
                        xq00Var.m91771i0(1313917368);
                        eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                        if (ug5Var instanceof kx91) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var.m91779m0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00VarM43272n2);
                        } else {
                            xq00Var.m91799w0();
                        }
                        m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                        zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                        zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                        zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                        xq00Var.m91788r(true);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(1314774735);
                        eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                        if (ug5Var instanceof kx91) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var.m91767g0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00VarM43272n);
                        } else {
                            xq00Var.m91799w0();
                        }
                        m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                        zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                        zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                        xq00Var.m91788r(true);
                        xq00Var.m91788r(false);
                    }
                    obj4 = obj7;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    obj4 = obj;
                }
                obj5 = obj2;
                obj6 = obj3;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
                }
            }
            i3 |= 3072;
            obj2 = gh00Var3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    obj3 = gh00Var4;
                    if (xq00Var.m91770i(obj3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z)) {
                    if (i11 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if (i4 != 0) {
                        obj7 = null;
                    } else {
                        obj7 = obj;
                    }
                    if (i6 != 0) {
                        obj2 = c2054kj;
                    }
                    if (i8 != 0) {
                        obj3 = c2054kj;
                    }
                    iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                    fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                    yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                    ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                    i10 = i3;
                    wpn0VarM91778m = xq00Var.m91778m();
                    hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                    h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                    if (obj7 != null) {
                        xq00Var.m91771i0(1313917368);
                        eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                        if (ug5Var instanceof kx91) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var.m91779m0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00VarM43272n2);
                        } else {
                            xq00Var.m91799w0();
                        }
                        m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                        zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                        zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                        zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                        xq00Var.m91788r(true);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(1314774735);
                        eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                        if (ug5Var instanceof kx91) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var.m91767g0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00VarM43272n);
                        } else {
                            xq00Var.m91799w0();
                        }
                        m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                        zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                        zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                        xq00Var.m91788r(true);
                        xq00Var.m91788r(false);
                    }
                    obj4 = obj7;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    obj4 = obj;
                }
                obj5 = obj2;
                obj6 = obj3;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
                }
            }
            i3 |= 24576;
            obj3 = gh00Var4;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z)) {
                if (i11 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                if (i4 != 0) {
                    obj7 = null;
                } else {
                    obj7 = obj;
                }
                if (i6 != 0) {
                    obj2 = c2054kj;
                }
                if (i8 != 0) {
                    obj3 = c2054kj;
                }
                iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                i10 = i3;
                wpn0VarM91778m = xq00Var.m91778m();
                hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                if (obj7 != null) {
                    xq00Var.m91771i0(1313917368);
                    eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                    if (ug5Var instanceof kx91) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(eh00VarM43272n2);
                    } else {
                        xq00Var.m91799w0();
                    }
                    m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                    zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                    zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                    zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                    xq00Var.m91788r(true);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(1314774735);
                    eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                    if (ug5Var instanceof kx91) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91767g0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(eh00VarM43272n);
                    } else {
                        xq00Var.m91799w0();
                    }
                    m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                    zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                    zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                    xq00Var.m91788r(true);
                    xq00Var.m91788r(false);
                }
                obj4 = obj7;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                obj4 = obj;
            }
            obj5 = obj2;
            obj6 = obj3;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
            }
        }
        i3 |= 48;
        fxh0Var2 = fxh0Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                obj = gh00Var2;
                if (xq00Var.m91770i(obj)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    obj2 = gh00Var3;
                    if (xq00Var.m91770i(obj2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        obj3 = gh00Var4;
                        if (xq00Var.m91770i(obj3)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i3 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (xq00Var.m91752Y(i3 & 1, z)) {
                        if (i11 != 0) {
                            fxh0Var3 = cxh0.f43038a;
                        } else {
                            fxh0Var3 = fxh0Var2;
                        }
                        if (i4 != 0) {
                            obj7 = null;
                        } else {
                            obj7 = obj;
                        }
                        if (i6 != 0) {
                            obj2 = c2054kj;
                        }
                        if (i8 != 0) {
                            obj3 = c2054kj;
                        }
                        iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                        fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                        yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                        ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                        i10 = i3;
                        wpn0VarM91778m = xq00Var.m91778m();
                        hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                        h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                        if (obj7 != null) {
                            xq00Var.m91771i0(1313917368);
                            eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                            if (ug5Var instanceof kx91) {
                                pmg1.m70360s();
                                throw null;
                            }
                            xq00Var.m91779m0();
                            if (xq00Var.f264808S) {
                                xq00Var.m91776l(eh00VarM43272n2);
                            } else {
                                xq00Var.m91799w0();
                            }
                            m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                            zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                            zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                            zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                            xq00Var.m91788r(true);
                            xq00Var.m91788r(false);
                        } else {
                            xq00Var.m91771i0(1314774735);
                            eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                            if (ug5Var instanceof kx91) {
                                pmg1.m70360s();
                                throw null;
                            }
                            xq00Var.m91767g0();
                            if (xq00Var.f264808S) {
                                xq00Var.m91776l(eh00VarM43272n);
                            } else {
                                xq00Var.m91799w0();
                            }
                            m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                            zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                            zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                            xq00Var.m91788r(true);
                            xq00Var.m91788r(false);
                        }
                        obj4 = obj7;
                    } else {
                        xq00Var.m91757b0();
                        fxh0Var3 = fxh0Var2;
                        obj4 = obj;
                    }
                    obj5 = obj2;
                    obj6 = obj3;
                    pgv0VarM91796v = xq00Var.m91796v();
                    if (pgv0VarM91796v != null) {
                        pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
                    }
                }
                i3 |= 24576;
                obj3 = gh00Var4;
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z)) {
                    if (i11 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if (i4 != 0) {
                        obj7 = null;
                    } else {
                        obj7 = obj;
                    }
                    if (i6 != 0) {
                        obj2 = c2054kj;
                    }
                    if (i8 != 0) {
                        obj3 = c2054kj;
                    }
                    iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                    fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                    yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                    ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                    i10 = i3;
                    wpn0VarM91778m = xq00Var.m91778m();
                    hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                    h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                    if (obj7 != null) {
                        xq00Var.m91771i0(1313917368);
                        eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                        if (ug5Var instanceof kx91) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var.m91779m0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00VarM43272n2);
                        } else {
                            xq00Var.m91799w0();
                        }
                        m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                        zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                        zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                        zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                        xq00Var.m91788r(true);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(1314774735);
                        eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                        if (ug5Var instanceof kx91) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var.m91767g0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00VarM43272n);
                        } else {
                            xq00Var.m91799w0();
                        }
                        m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                        zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                        zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                        xq00Var.m91788r(true);
                        xq00Var.m91788r(false);
                    }
                    obj4 = obj7;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    obj4 = obj;
                }
                obj5 = obj2;
                obj6 = obj3;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
                }
            }
            i3 |= 3072;
            obj2 = gh00Var3;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    obj3 = gh00Var4;
                    if (xq00Var.m91770i(obj3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z)) {
                    if (i11 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if (i4 != 0) {
                        obj7 = null;
                    } else {
                        obj7 = obj;
                    }
                    if (i6 != 0) {
                        obj2 = c2054kj;
                    }
                    if (i8 != 0) {
                        obj3 = c2054kj;
                    }
                    iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                    fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                    yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                    ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                    i10 = i3;
                    wpn0VarM91778m = xq00Var.m91778m();
                    hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                    h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                    if (obj7 != null) {
                        xq00Var.m91771i0(1313917368);
                        eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                        if (ug5Var instanceof kx91) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var.m91779m0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00VarM43272n2);
                        } else {
                            xq00Var.m91799w0();
                        }
                        m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                        zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                        zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                        zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                        xq00Var.m91788r(true);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(1314774735);
                        eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                        if (ug5Var instanceof kx91) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var.m91767g0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00VarM43272n);
                        } else {
                            xq00Var.m91799w0();
                        }
                        m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                        zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                        zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                        xq00Var.m91788r(true);
                        xq00Var.m91788r(false);
                    }
                    obj4 = obj7;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    obj4 = obj;
                }
                obj5 = obj2;
                obj6 = obj3;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
                }
            }
            i3 |= 24576;
            obj3 = gh00Var4;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z)) {
                if (i11 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                if (i4 != 0) {
                    obj7 = null;
                } else {
                    obj7 = obj;
                }
                if (i6 != 0) {
                    obj2 = c2054kj;
                }
                if (i8 != 0) {
                    obj3 = c2054kj;
                }
                iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                i10 = i3;
                wpn0VarM91778m = xq00Var.m91778m();
                hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                if (obj7 != null) {
                    xq00Var.m91771i0(1313917368);
                    eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                    if (ug5Var instanceof kx91) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(eh00VarM43272n2);
                    } else {
                        xq00Var.m91799w0();
                    }
                    m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                    zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                    zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                    zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                    xq00Var.m91788r(true);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(1314774735);
                    eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                    if (ug5Var instanceof kx91) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91767g0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(eh00VarM43272n);
                    } else {
                        xq00Var.m91799w0();
                    }
                    m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                    zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                    zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                    xq00Var.m91788r(true);
                    xq00Var.m91788r(false);
                }
                obj4 = obj7;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                obj4 = obj;
            }
            obj5 = obj2;
            obj6 = obj3;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
            }
        }
        i3 |= 384;
        obj = gh00Var2;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                obj2 = gh00Var3;
                if (xq00Var.m91770i(obj2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    obj3 = gh00Var4;
                    if (xq00Var.m91770i(obj3)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq00Var.m91752Y(i3 & 1, z)) {
                    if (i11 != 0) {
                        fxh0Var3 = cxh0.f43038a;
                    } else {
                        fxh0Var3 = fxh0Var2;
                    }
                    if (i4 != 0) {
                        obj7 = null;
                    } else {
                        obj7 = obj;
                    }
                    if (i6 != 0) {
                        obj2 = c2054kj;
                    }
                    if (i8 != 0) {
                        obj3 = c2054kj;
                    }
                    iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                    fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                    yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                    ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                    i10 = i3;
                    wpn0VarM91778m = xq00Var.m91778m();
                    hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                    h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                    if (obj7 != null) {
                        xq00Var.m91771i0(1313917368);
                        eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                        if (ug5Var instanceof kx91) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var.m91779m0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00VarM43272n2);
                        } else {
                            xq00Var.m91799w0();
                        }
                        m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                        zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                        zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                        zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                        xq00Var.m91788r(true);
                        xq00Var.m91788r(false);
                    } else {
                        xq00Var.m91771i0(1314774735);
                        eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                        if (ug5Var instanceof kx91) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var.m91767g0();
                        if (xq00Var.f264808S) {
                            xq00Var.m91776l(eh00VarM43272n);
                        } else {
                            xq00Var.m91799w0();
                        }
                        m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                        zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                        zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                        xq00Var.m91788r(true);
                        xq00Var.m91788r(false);
                    }
                    obj4 = obj7;
                } else {
                    xq00Var.m91757b0();
                    fxh0Var3 = fxh0Var2;
                    obj4 = obj;
                }
                obj5 = obj2;
                obj6 = obj3;
                pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
                }
            }
            i3 |= 24576;
            obj3 = gh00Var4;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z)) {
                if (i11 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                if (i4 != 0) {
                    obj7 = null;
                } else {
                    obj7 = obj;
                }
                if (i6 != 0) {
                    obj2 = c2054kj;
                }
                if (i8 != 0) {
                    obj3 = c2054kj;
                }
                iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                i10 = i3;
                wpn0VarM91778m = xq00Var.m91778m();
                hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                if (obj7 != null) {
                    xq00Var.m91771i0(1313917368);
                    eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                    if (ug5Var instanceof kx91) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(eh00VarM43272n2);
                    } else {
                        xq00Var.m91799w0();
                    }
                    m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                    zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                    zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                    zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                    xq00Var.m91788r(true);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(1314774735);
                    eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                    if (ug5Var instanceof kx91) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91767g0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(eh00VarM43272n);
                    } else {
                        xq00Var.m91799w0();
                    }
                    m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                    zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                    zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                    xq00Var.m91788r(true);
                    xq00Var.m91788r(false);
                }
                obj4 = obj7;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                obj4 = obj;
            }
            obj5 = obj2;
            obj6 = obj3;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
            }
        }
        i3 |= 3072;
        obj2 = gh00Var3;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                obj3 = gh00Var4;
                if (xq00Var.m91770i(obj3)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z)) {
                if (i11 != 0) {
                    fxh0Var3 = cxh0.f43038a;
                } else {
                    fxh0Var3 = fxh0Var2;
                }
                if (i4 != 0) {
                    obj7 = null;
                } else {
                    obj7 = obj;
                }
                if (i6 != 0) {
                    obj2 = c2054kj;
                }
                if (i8 != 0) {
                    obj3 = c2054kj;
                }
                iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
                fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
                yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
                i10 = i3;
                wpn0VarM91778m = xq00Var.m91778m();
                hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
                h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
                if (obj7 != null) {
                    xq00Var.m91771i0(1313917368);
                    eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                    if (ug5Var instanceof kx91) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91779m0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(eh00VarM43272n2);
                    } else {
                        xq00Var.m91799w0();
                    }
                    m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                    zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                    zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                    zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                    xq00Var.m91788r(true);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(1314774735);
                    eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                    if (ug5Var instanceof kx91) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var.m91767g0();
                    if (xq00Var.f264808S) {
                        xq00Var.m91776l(eh00VarM43272n);
                    } else {
                        xq00Var.m91799w0();
                    }
                    m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                    zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                    zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                    xq00Var.m91788r(true);
                    xq00Var.m91788r(false);
                }
                obj4 = obj7;
            } else {
                xq00Var.m91757b0();
                fxh0Var3 = fxh0Var2;
                obj4 = obj;
            }
            obj5 = obj2;
            obj6 = obj3;
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
            }
        }
        i3 |= 24576;
        obj3 = gh00Var4;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i3 & 1, z)) {
            if (i11 != 0) {
                fxh0Var3 = cxh0.f43038a;
            } else {
                fxh0Var3 = fxh0Var2;
            }
            if (i4 != 0) {
                obj7 = null;
            } else {
                obj7 = obj;
            }
            if (i6 != 0) {
                obj2 = c2054kj;
            }
            if (i8 != 0) {
                obj3 = c2054kj;
            }
            iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
            fxh0VarM48286s = hqg1.m48286s(xq00Var, omo0.m67366r(fxh0Var3));
            yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
            ko70Var = (ko70) xq00Var.m91774k(wsh.f254623n);
            i10 = i3;
            wpn0VarM91778m = xq00Var.m91778m();
            hc80Var = (hc80) xq00Var.m91774k(sda0.f207965a);
            h9y0Var = (h9y0) xq00Var.m91774k(rea0.f198327a);
            if (obj7 != null) {
                xq00Var.m91771i0(1313917368);
                eh00VarM43272n2 = m43272n(gh00Var, xq00Var, i10 & 14);
                if (ug5Var instanceof kx91) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(eh00VarM43272n2);
                } else {
                    xq00Var.m91799w0();
                }
                m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                zsf1.m96835F(obj7, j30.f108229e, xq00Var);
                zsf1.m96835F(obj3, oz2.f171943W0, xq00Var);
                zsf1.m96835F(obj2, oz2.f171945X0, xq00Var);
                xq00Var.m91788r(true);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(1314774735);
                eh00VarM43272n = m43272n(gh00Var, xq00Var, i10 & 14);
                if (ug5Var instanceof kx91) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91767g0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(eh00VarM43272n);
                } else {
                    xq00Var.m91799w0();
                }
                m43283z(xq00Var, fxh0VarM48286s, iHashCode, yqqVar, hc80Var, h9y0Var, ko70Var, wpn0VarM91778m);
                zsf1.m96835F(obj3, oz2.f171947Y0, xq00Var);
                zsf1.m96835F(obj2, oz2.f171949Z0, xq00Var);
                xq00Var.m91788r(true);
                xq00Var.m91788r(false);
            }
            obj4 = obj7;
        } else {
            xq00Var.m91757b0();
            fxh0Var3 = fxh0Var2;
            obj4 = obj;
        }
        obj5 = obj2;
        obj6 = obj3;
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ni1((Object) gh00Var, fxh0Var3, obj4, obj5, obj6, i, i2, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43261b(gh00 gh00Var, fxh0 fxh0Var, gh00 gh00Var2, xq00 xq00Var, int i, int i2) {
        int i3;
        fxh0 fxh0Var2;
        gh00 gh00Var3;
        C2054kj c2054kj = C2054kj.f123184g;
        xq00Var.m91775k0(-1783766393);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(gh00Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= xq00Var.m91766g(fxh0Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= xq00Var.m91770i(gh00Var2) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                fxh0Var = cxh0.f43038a;
            }
            gh00 gh00Var4 = i5 != 0 ? c2054kj : gh00Var2;
            fxh0 fxh0Var3 = fxh0Var;
            m43260a(gh00Var, fxh0Var3, null, c2054kj, gh00Var4, xq00Var, (i3 & 14) | 3072 | (i3 & ContentType.LONG_FORM_ON_DEMAND) | ((i3 << 6) & 57344), 4);
            fxh0Var2 = fxh0Var3;
            gh00Var3 = gh00Var4;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
            gh00Var3 = gh00Var2;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y70(i, gh00Var, gh00Var3, fxh0Var2, i2, 4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m43262c(final eh00 eh00Var, final fxh0 fxh0Var, final boolean z, int i, ch01 ch01Var, long j, long j2, w9a w9aVar, f4m0 f4m0Var, final fyf fyfVar, xq00 xq00Var, final int i2) {
        eh00 eh00Var2;
        int i3;
        boolean z2;
        final int i4;
        final ch01 ch01Var2;
        final long j3;
        final long j4;
        final w9a w9aVar2;
        final f4m0 f4m0Var2;
        final ch01 ch01Var3;
        final long j5;
        final long jM86771k;
        final w9a w9aVarM88334m;
        final f4m0 f4m0VarM49490f;
        xq00Var.m91775k0(-1266485519);
        if ((i2 & 6) == 0) {
            eh00Var2 = eh00Var;
            i3 = (xq00Var.m91770i(eh00Var2) ? 4 : 2) | i2;
        } else {
            eh00Var2 = eh00Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq00Var.m91766g(fxh0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z2 = z;
            i3 |= xq00Var.m91768h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        int i5 = 224256 | i3;
        if ((1572864 & i2) == 0) {
            i5 = 748544 | i3;
        }
        if ((12582912 & i2) == 0) {
            i5 |= 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= 268435456;
        }
        int i6 = 1;
        if (xq00Var.m91752Y(i5 & 1, (306783379 & i5) != 306783378)) {
            xq00Var.m91761d0();
            if ((i2 & 1) == 0 || xq00Var.m91735E()) {
                ii01 ii01Var = zf10.f282178h;
                ch01 ch01VarM50673a = vqg1.m86245w(xq00Var).m50673a();
                long jM66460a = vqg1.m86243u(xq00Var).m66460a();
                ch01Var3 = ch01VarM50673a;
                j5 = jM66460a;
                jM86771k = vyg1.m86771k(jM66460a);
                w9aVarM88334m = wjg1.m88334m(xq00Var);
                f4m0VarM49490f = i2h1.m49490f(xq00Var);
            } else {
                xq00Var.m91757b0();
                i6 = i;
                ch01Var3 = ch01Var;
                j5 = j;
                jM86771k = j2;
                w9aVarM88334m = w9aVar;
                f4m0VarM49490f = f4m0Var;
            }
            xq00Var.m91790s();
            final float fM49492h = i2h1.m49492h(xq00Var);
            final float fM49493i = i2h1.m49493i(xq00Var);
            final float fM49498n = i2h1.m49498n(i6);
            ii01 ii01Var2 = zf10.f282178h;
            final q761 q761Var = new q761(vqg1.m86244v(xq00Var).m57359a());
            xq00Var.m91771i0(1418603946);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = hbg1.m47035f();
                xq00Var.m91793t0(objM91750T);
            }
            final voi0 voi0Var = (voi0) objM91750T;
            xq00Var.m91788r(false);
            final eh00 eh00Var3 = eh00Var2;
            final boolean z3 = z2;
            qqg1.m73532b(wa71.m87583b().mo30068a(vqg1.m86246x(xq00Var).m76102a()), rkk.m75772x(-1764361679, new th00(z3, ch01Var3, j5, jM86771k, q761Var, w9aVarM88334m, voi0Var, eh00Var3, fM49498n, f4m0VarM49490f, fM49493i, fyfVar, fM49492h) { // from class: p.ita

                /* JADX INFO: renamed from: X */
                public final /* synthetic */ f4m0 f105480X;

                /* JADX INFO: renamed from: Y */
                public final /* synthetic */ fyf f105481Y;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f105483b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ch01 f105484c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f105485d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f105486e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ q761 f105487f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ w9a f105488g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ voi0 f105489h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ eh00 f105490i;

                /* JADX INFO: renamed from: t */
                public final /* synthetic */ float f105491t;

                {
                    this.f105481Y = fyfVar;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    xq00 xq00Var2 = (xq00) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    final int i7 = 1;
                    final int i8 = 0;
                    boolean z4 = (iIntValue & 3) != 2;
                    ug5 ug5Var = xq00Var2.f264811a;
                    if (xq00Var2.m91752Y(iIntValue & 1, z4)) {
                        Object objM91750T2 = xq00Var2.m91750T();
                        ia7 ia7Var = t6x0.f217647t;
                        if (objM91750T2 == ia7Var) {
                            objM91750T2 = new C2126mg(12);
                            xq00Var2.m91793t0(objM91750T2);
                        }
                        fxh0 fxh0VarM96644b = zoz0.m96644b(this.f105482a, false, (gh00) objM91750T2);
                        float f = e861.f57084a;
                        xq00Var2.m91771i0(-71932855);
                        Object objM91750T3 = xq00Var2.m91750T();
                        if (objM91750T3 == ia7Var) {
                            objM91750T3 = s95.m77551a(0.0f);
                            xq00Var2.m91793t0(objM91750T3);
                        }
                        gw4 gw4Var = (gw4) objM91750T3;
                        Object objM91750T4 = xq00Var2.m91750T();
                        q761 q761Var2 = this.f105487f;
                        if (objM91750T4 == ia7Var) {
                            objM91750T4 = sam.m77674m(new v631(i7, q761Var2, gw4Var));
                            xq00Var2.m91793t0(objM91750T4);
                        }
                        rv41 rv41Var = (rv41) objM91750T4;
                        fbk fbkVar = null;
                        voi0 voi0Var2 = this.f105489h;
                        if (voi0Var2 != null) {
                            xq00Var2.m91771i0(237696389);
                            boolean zM91766g = xq00Var2.m91766g(voi0Var2) | xq00Var2.m91770i(gw4Var);
                            Object objM91750T5 = xq00Var2.m91750T();
                            if (zM91766g || objM91750T5 == ia7Var) {
                                objM91750T5 = new h431(voi0Var2, gw4Var, fbkVar, 20);
                                xq00Var2.m91793t0(objM91750T5);
                            }
                            hz40.m49237i(voi0Var2, (th00) objM91750T5, xq00Var2);
                            xq00Var2.m91788r(false);
                        } else {
                            xq00Var2.m91771i0(238330649);
                            xq00Var2.m91788r(false);
                        }
                        Object objM91750T6 = xq00Var2.m91750T();
                        int i9 = 6;
                        if (objM91750T6 == ia7Var) {
                            objM91750T6 = new x29(rv41Var, i9);
                            xq00Var2.m91793t0(objM91750T6);
                        }
                        fxh0 fxh0VarM25944p = ahf1.m25944p(fxh0VarM96644b, (vh00) objM91750T6);
                        final itq itqVar = q761Var2.f186040a;
                        boolean zM91770i = xq00Var2.m91770i(gw4Var);
                        Object objM91750T7 = xq00Var2.m91750T();
                        if (zM91770i || objM91750T7 == ia7Var) {
                            objM91750T7 = new ew40(gw4Var, 28);
                            xq00Var2.m91793t0(objM91750T7);
                        }
                        final eh00 eh00Var4 = (eh00) objM91750T7;
                        gh00 gh00Var = new gh00() { // from class: p.jtq
                            @Override // p204p.gh00
                            public final Object invoke(Object obj3) {
                                lq9 lq9Var = (lq9) obj3;
                                switch (i8) {
                                    case 0:
                                        itq itqVar2 = itqVar;
                                        wg01 wg01VarM85639u = null;
                                        wg01 wg01Var = itqVar2 != null ? itqVar2.f105670a : null;
                                        float fFloatValue = ((Number) eh00Var4.invoke()).floatValue();
                                        if (wg01Var != null) {
                                            wj50.m88279p(wg01Var);
                                            wg01VarM85639u = vie1.m85639u(wg01Var.m88004h(), wg01Var, fFloatValue);
                                        }
                                        if (wg01VarM85639u != null) {
                                            c95.m31829Y(lq9Var, wg01VarM85639u);
                                        }
                                        break;
                                    default:
                                        itq itqVar3 = itqVar;
                                        wg01 wg01VarM85639u2 = null;
                                        wg01 wg01Var2 = itqVar3 != null ? itqVar3.f105671b : null;
                                        float fFloatValue2 = ((Number) eh00Var4.invoke()).floatValue();
                                        if (wg01Var2 != null) {
                                            wj50.m88279p(wg01Var2);
                                            wg01VarM85639u2 = vie1.m85639u(wg01Var2.m88004h(), wg01Var2, fFloatValue2);
                                        }
                                        if (wg01VarM85639u2 != null) {
                                            c95.m31829Y(lq9Var, wg01VarM85639u2);
                                        }
                                        break;
                                }
                                return w2a1.f247311a;
                            }
                        };
                        ch01 ch01Var4 = this.f105484c;
                        fxh0 fxh0VarM59754v = lqg1.m59754v(lqg1.m59754v(fxh0VarM25944p, ch01Var4, gh00Var), ch01Var4, new gh00() { // from class: p.jtq
                            @Override // p204p.gh00
                            public final Object invoke(Object obj3) {
                                lq9 lq9Var = (lq9) obj3;
                                switch (i7) {
                                    case 0:
                                        itq itqVar2 = itqVar;
                                        wg01 wg01VarM85639u = null;
                                        wg01 wg01Var = itqVar2 != null ? itqVar2.f105670a : null;
                                        float fFloatValue = ((Number) eh00Var4.invoke()).floatValue();
                                        if (wg01Var != null) {
                                            wj50.m88279p(wg01Var);
                                            wg01VarM85639u = vie1.m85639u(wg01Var.m88004h(), wg01Var, fFloatValue);
                                        }
                                        if (wg01VarM85639u != null) {
                                            c95.m31829Y(lq9Var, wg01VarM85639u);
                                        }
                                        break;
                                    default:
                                        itq itqVar3 = itqVar;
                                        wg01 wg01VarM85639u2 = null;
                                        wg01 wg01Var2 = itqVar3 != null ? itqVar3.f105671b : null;
                                        float fFloatValue2 = ((Number) eh00Var4.invoke()).floatValue();
                                        if (wg01Var2 != null) {
                                            wj50.m88279p(wg01Var2);
                                            wg01VarM85639u2 = vie1.m85639u(wg01Var2.m88004h(), wg01Var2, fFloatValue2);
                                        }
                                        if (wg01VarM85639u2 != null) {
                                            c95.m31829Y(lq9Var, wg01VarM85639u2);
                                        }
                                        break;
                                }
                                return w2a1.f247311a;
                            }
                        });
                        xq00Var2.m91788r(false);
                        fxh0 fxh0VarMo34315F = r9g1.m75068p(fxh0VarM59754v, ch01Var4).mo34315F(new hgj(this.f105486e));
                        boolean z5 = this.f105483b;
                        fxh0 fxh0VarM96864x = zsf1.m96864x(mi21.m61818b(hdi.m47247x(nec.m64246i(fxh0VarMo34315F.mo34315F(new k861(z5, ch01Var4, this.f105488g, voi0Var2)), this.f105485d, ch01Var4), z5, null, null, voi0Var2, this.f105490i, 6), 0.0f, this.f105491t, 1), this.f105480X);
                        irx0 irx0VarM36744a = drx0.m36744a(bj5.f27614e, d7f0.f46142M0, xq00Var2, 54);
                        int iHashCode = Long.hashCode(xq00Var2.f264809T);
                        wpn0 wpn0VarM91778m = xq00Var2.m91778m();
                        fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM96864x);
                        soh.f211194A.getClass();
                        C2087le c2087le = roh.f201257b;
                        if (ug5Var == null) {
                            pmg1.m70360s();
                            throw null;
                        }
                        xq00Var2.m91779m0();
                        if (xq00Var2.f264808S) {
                            xq00Var2.m91776l(c2087le);
                        } else {
                            xq00Var2.m91799w0();
                        }
                        zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
                        zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
                        zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
                        zsf1.m96833D(roh.f201266k, xq00Var2);
                        zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
                        xq00Var2.m91771i0(616279701);
                        xq00Var2.m91788r(false);
                        this.f105481Y.mo24510D0(prx0.f180692a, xq00Var2, 6);
                        xq00Var2.m91771i0(616605077);
                        xq00Var2.m91788r(false);
                        xq00Var2.m91788r(true);
                    } else {
                        xq00Var2.m91757b0();
                    }
                    return w2a1.f247311a;
                }
            }, xq00Var), xq00Var, 56);
            i4 = i6;
            ch01Var2 = ch01Var3;
            j3 = j5;
            j4 = jM86771k;
            w9aVar2 = w9aVarM88334m;
            f4m0Var2 = f4m0VarM49490f;
        } else {
            xq00Var.m91757b0();
            i4 = i;
            ch01Var2 = ch01Var;
            j3 = j;
            j4 = j2;
            w9aVar2 = w9aVar;
            f4m0Var2 = f4m0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new th00() { // from class: p.jta
                @Override // p204p.th00
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g0b1.m43262c(eh00Var, fxh0Var, z, i4, ch01Var2, j3, j4, w9aVar2, f4m0Var2, fyfVar, (xq00) obj, fyg1.m43076B(i2 | 1));
                    return w2a1.f247311a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final kzz m43263d(czz... czzVarArr) {
        return new kzz(bk5.m29611g0(czzVarArr));
    }

    /* JADX INFO: renamed from: e */
    public static final void m43264e(rsu0 rsu0Var, gh00 gh00Var, eh00 eh00Var, eh00 eh00Var2, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-370860690);
        int i3 = i | (xq00Var.m91762e(rsu0Var == null ? -1 : rsu0Var.ordinal()) ? 4 : 2) | (xq00Var.m91770i(gh00Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128) | (xq00Var.m91770i(eh00Var2) ? 2048 : 1024);
        int i4 = 0;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            jxu jxuVarM58816b = leu.m58816b(xq00Var);
            zi5 zi5Var = bj5.f27610a;
            xi5 xi5VarM29370g = bj5.m29370g(jxuVarM58816b.f117230b.f224765h);
            vb9 vb9Var = d7f0.f46142M0;
            fxh0 fxh0VarM68431H = oyf1.m68431H(cxh0.f43038a, oyf1.m68467i0(0, 0, 1, xq00Var));
            irx0 irx0VarM36744a = drx0.m36744a(xi5VarM29370g, vb9Var, xq00Var, 0);
            int iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM68431H);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            qmz0.m73309b(((i3 >> 3) & 896) | 3078, k0e1.m54977L(R.string.ereader_back, xq00Var), "ereader_selection_menu_color_picker_back", olg.f166839a, eh00Var2, xq00Var);
            xq00Var.m91771i0(-178800805);
            nzv nzvVarM76354a = rsu0.m76354a();
            nzvVarM76354a.getClass();
            C2042k7 c2042k7 = new C2042k7(nzvVarM76354a, i4);
            while (c2042k7.hasNext()) {
                rsu0 rsu0Var2 = (rsu0) c2042k7.next();
                fyf fyfVarM75772x = rkk.m75772x(-884701107, new wo0(rsu0Var2 == rsu0Var, jxuVarM58816b, rsu0Var2, 13), xq00Var);
                int iOrdinal = rsu0Var2.ordinal();
                if (iOrdinal == 0) {
                    i2 = R.string.ereader_highlight_yellow;
                } else if (iOrdinal == 1) {
                    i2 = R.string.ereader_highlight_green;
                } else if (iOrdinal == 2) {
                    i2 = R.string.ereader_highlight_blue;
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R.string.ereader_highlight_pink;
                }
                String strM54977L = k0e1.m54977L(i2, xq00Var);
                boolean zM91762e = ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | xq00Var.m91762e(rsu0Var2.ordinal());
                Object objM91750T = xq00Var.m91750T();
                if (zM91762e || objM91750T == t6x0.f217647t) {
                    objM91750T = new p200(20, gh00Var, rsu0Var2);
                    xq00Var.m91793t0(objM91750T);
                }
                qmz0.m73309b(6, strM54977L, qhg1.m72828s(rsu0Var2), fyfVarM75772x, (eh00) objM91750T, xq00Var);
            }
            xq00Var.m91788r(false);
            if (rsu0Var != null) {
                xq00Var.m91771i0(-1246681982);
                qmz0.m73309b((i3 & 896) | 3078, k0e1.m54977L(R.string.ereader_highlight_remove, xq00Var), "ereader_selection_menu_color_picker_remove", rkk.m75772x(-671898909, new a720(jxuVarM58816b, 6), xq00Var), eh00Var, xq00Var);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1245807472);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y5z(rsu0Var, gh00Var, eh00Var, eh00Var2, i, 11);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final phc1 m43265f(lp70 lp70Var) {
        hu4 hu4Var = lp70Var.f135653N0;
        if (hu4Var != null) {
            return (phc1) hu4Var;
        }
        throw edb.m38576y("Required value was null.");
    }

    /* JADX INFO: renamed from: h */
    public static long m43266h(boolean z, int i, to8 to8Var, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long jScalb = to8Var == to8.f222197b ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (z2) {
            long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    /* JADX INFO: renamed from: i */
    public static String m43267i(String str, int i, int i2, int i3, String str2) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m43268j(str, i4, i2, str2, (i3 & 8) == 0, (i3 & 16) == 0, (i3 & 32) == 0, (i3 & 64) == 0, 128);
    }

    /* JADX INFO: renamed from: j */
    public static String m43268j(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) throws EOFException {
        int i4 = 0;
        int i5 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 64) != 0 ? false : z4;
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z7) || wl51.m88497u0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !m43276r(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                npa npaVar = new npa();
                npaVar.m65303P(i5, iCharCount, str);
                npa npaVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            npaVar.m65303P(i4, 1, "+");
                        } else if (iCodePointAt2 == 43 && z3) {
                            String str3 = z5 ? "+" : "%2B";
                            npaVar.m65303P(i4, str3.length(), str3);
                        } else {
                            if (iCodePointAt2 >= 32 && iCodePointAt2 != 127) {
                                if ((iCodePointAt2 < 128 || z7) && !wl51.m88497u0(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z5 && (!z6 || m43276r(iCharCount, length, str))))) {
                                    npaVar.m65305U(iCodePointAt2);
                                }
                            }
                            if (npaVar2 == null) {
                                npaVar2 = new npa();
                            }
                            npaVar2.m65305U(iCodePointAt2);
                            while (!npaVar2.mo45420R0()) {
                                byte b = npaVar2.readByte();
                                npaVar.m65298J(37);
                                char[] cArr = f75330d;
                                npaVar.m65298J(cArr[((b & 255) >> 4) & 15]);
                                npaVar.m65298J(cArr[b & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i4 = 0;
                }
                return npaVar.mo45428s1();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i5, length);
    }

    /* JADX INFO: renamed from: k */
    public static final pqm0 m43269k(ayd0 ayd0Var) {
        Charset charset = vuc.f244913a;
        if (ayd0Var != null) {
            urv0 urv0Var = ayd0.f21209e;
            Charset charsetM27513a = ayd0Var.m27513a(null);
            if (charsetM27513a == null) {
                try {
                    ayd0Var = zn91.m96520H(ayd0Var + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    ayd0Var = null;
                }
            } else {
                charset = charsetM27513a;
            }
        }
        return pft0.m69840u(charset, ayd0Var);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m43270l(qu80 qu80Var, in80... in80VarArr) {
        int iIntValue = 0;
        for (in80 in80Var : (in80[]) Arrays.copyOf(in80VarArr, in80VarArr.length)) {
            Integer num = (Integer) qu80Var.f192603i.get(in80Var);
            iIntValue += num != null ? num.intValue() : 0;
        }
        return iIntValue > 0;
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m43271m(qu80 qu80Var, in80... in80VarArr) {
        if (m43270l(qu80Var, (in80[]) Arrays.copyOf(in80VarArr, in80VarArr.length))) {
            in80[] in80VarArrValues = in80.values();
            ArrayList arrayList = new ArrayList();
            for (in80 in80Var : in80VarArrValues) {
                if (!bk5.m29621l0(in80VarArr, in80Var)) {
                    arrayList.add(in80Var);
                }
            }
            in80[] in80VarArr2 = (in80[]) arrayList.toArray(new in80[0]);
            if (!m43270l(qu80Var, (in80[]) Arrays.copyOf(in80VarArr2, in80VarArr2.length))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static final eh00 m43272n(gh00 gh00Var, xq00 xq00Var, int i) {
        int iHashCode = Long.hashCode(pmg1.m70357p(xq00Var));
        Context context = (Context) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f502b);
        vq00 vq00VarM70361t = pmg1.m70361t(xq00Var);
        e8y0 e8y0Var = (e8y0) xq00Var.m91774k(g8y0.f77630a);
        View view = (View) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f506f);
        boolean zM91770i = ((((i & 14) ^ 6) > 4 && xq00Var.m91766g(gh00Var)) || (i & 6) == 4) | xq00Var.m91770i(context) | xq00Var.m91770i(vq00VarM70361t) | xq00Var.m91770i(e8y0Var) | xq00Var.m91762e(iHashCode) | xq00Var.m91770i(view);
        Object objM91750T = xq00Var.m91750T();
        if (zM91770i || objM91750T == t6x0.f217647t) {
            Object ku4Var = new ku4(context, gh00Var, vq00VarM70361t, e8y0Var, iHashCode, view);
            xq00Var.m91793t0(ku4Var);
            objM91750T = ku4Var;
        }
        return (eh00) objM91750T;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: o */
    public static gx71 m43273o(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return gx71.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return gx71.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return gx71.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return gx71.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return gx71.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    /* JADX INFO: renamed from: p */
    public static final int m43274p(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        wj50.m88279p(columnNames);
        String strConcat = ".".concat(str);
        String strM36608h = dq60.m36608h('`', ".", str);
        int length = columnNames.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str2 = columnNames[i];
            int i3 = i2 + 1;
            if (str2.length() >= str.length() + 2 && (bm51.m29796g0(str2, strConcat, false) || (str2.charAt(0) == '`' && bm51.m29796g0(str2, strM36608h, false)))) {
                return i2;
            }
            i++;
            i2 = i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public static final int m43275q(Cursor cursor, String str) {
        String strM29592O0;
        int iM43274p = m43274p(cursor, str);
        if (iM43274p >= 0) {
            return iM43274p;
        }
        try {
            strM29592O0 = bk5.m29592O0(cursor.getColumnNames(), null, null, null, null, 63);
        } catch (Exception unused) {
            strM29592O0 = "unknown";
        }
        throw new IllegalArgumentException(edb.m38566o("column '", str, "' does not exist. Available columns: ", strM29592O0));
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m43276r(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && a0f1.m24352m(str.charAt(i + 1)) != -1 && a0f1.m24352m(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: s */
    public static vsz0 m43277s(th00 th00Var) {
        vsz0 vsz0Var = new vsz0();
        vsz0Var.f244517d = seg1.m77912d(vsz0Var, vsz0Var, th00Var);
        return vsz0Var;
    }

    /* JADX INFO: renamed from: t */
    public static vra0 m43278t(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zM29803n0 = bm51.m29803n0(str, "HTTP/1.", false);
        r3t0 r3t0Var = r3t0.HTTP_1_0;
        r3t0 r3t0Var2 = r3t0.HTTP_1_1;
        if (zM29803n0) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                r3t0Var = r3t0Var2;
            }
        } else if (bm51.m29803n0(str, "ICY ", false)) {
            i = 4;
        } else {
            if (!bm51.m29803n0(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            r3t0Var = r3t0Var2;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numM29807r0 = bm51.m29807r0(str.substring(i, i2));
        if (numM29807r0 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numM29807r0.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new vra0(r3t0Var, iIntValue, strSubstring);
    }

    /* JADX INFO: renamed from: u */
    public static String m43279u(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                npa npaVar = new npa();
                npaVar.m65303P(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iM24352m = a0f1.m24352m(str.charAt(iCharCount + 1));
                        int iM24352m2 = a0f1.m24352m(str.charAt(i4));
                        if (iM24352m == -1 || iM24352m2 == -1) {
                            npaVar.m65305U(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            npaVar.m65298J((iM24352m << 4) + iM24352m2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        npaVar.m65298J(32);
                        iCharCount++;
                    } else {
                        npaVar.m65305U(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return npaVar.mo45428s1();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: v */
    public static m7f0 m43280v(MappedByteBuffer mappedByteBuffer) throws IOException {
        long jM62281i;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        mm90 mm90Var = new mm90(byteBufferDuplicate);
        mm90Var.m62283k(4);
        int iM62282j = mm90Var.m62282j();
        if (iM62282j > 100) {
            throw new IOException("Cannot read metadata.");
        }
        mm90Var.m62283k(6);
        int i = 0;
        while (true) {
            if (i >= iM62282j) {
                jM62281i = -1;
                break;
            }
            int iM62280h = mm90Var.m62280h();
            mm90Var.m62283k(4);
            jM62281i = mm90Var.m62281i();
            mm90Var.m62283k(4);
            if (1835365473 == iM62280h) {
                break;
            }
            i++;
        }
        if (jM62281i != -1) {
            mm90Var.m62283k((int) (jM62281i - mm90Var.m62278e()));
            mm90Var.m62283k(12);
            long jM62281i2 = mm90Var.m62281i();
            for (int i2 = 0; i2 < jM62281i2; i2++) {
                int iM62280h2 = mm90Var.m62280h();
                long jM62281i3 = mm90Var.m62281i();
                mm90Var.m62281i();
                if (1164798569 == iM62280h2 || 1701669481 == iM62280h2) {
                    byteBufferDuplicate.position((int) new ykq(6, jM62281i3 + jM62281i).m94115b());
                    m7f0 m7f0Var = new m7f0();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    m7f0Var.f232071b = byteBufferDuplicate;
                    m7f0Var.f232070a = iPosition;
                    int i3 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    m7f0Var.f232072c = i3;
                    m7f0Var.f232073d = m7f0Var.f232071b.getShort(i3);
                    return m7f0Var;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX INFO: renamed from: w */
    public static final void m43281w(String str) {
        System.err.println("SLF4J: " + str);
    }

    /* JADX INFO: renamed from: x */
    public static final CompletableCreate m43282x(juk jukVar, th00 th00Var) {
        if (jukVar.mo26595B(gk40.f80712X0) == null) {
            return new CompletableCreate(new w790(jukVar, th00Var, 1));
        }
        throw new IllegalArgumentException(("Completable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + jukVar).toString());
    }

    /* JADX INFO: renamed from: z */
    public static final void m43283z(xq00 xq00Var, fxh0 fxh0Var, int i, yqq yqqVar, hc80 hc80Var, h9y0 h9y0Var, ko70 ko70Var, wpn0 wpn0Var) {
        soh.f211194A.getClass();
        zsf1.m96835F(wpn0Var, roh.f201261f, xq00Var);
        zsf1.m96835F(fxh0Var, oz2.f171950a1, xq00Var);
        zsf1.m96835F(yqqVar, oz2.f171952b1, xq00Var);
        zsf1.m96835F(hc80Var, oz2.f171954c1, xq00Var);
        zsf1.m96835F(h9y0Var, lu4.f136985b, xq00Var);
        zsf1.m96835F(ko70Var, lu4.f136987c, xq00Var);
        zsf1.m96835F(Integer.valueOf(i), roh.f201265j, xq00Var);
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo26964y(fh61 fh61Var, fh61 fh61Var2, Window window, View view, boolean z, boolean z2);

    /* JADX INFO: renamed from: g */
    public void mo30327g(Window window) {
    }
}
