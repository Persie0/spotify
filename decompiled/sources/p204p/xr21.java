package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class xr21 extends s4x0 implements th00 {

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ boolean f265243X;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f265244Y;

    /* JADX INFO: renamed from: b */
    public Object f265245b;

    /* JADX INFO: renamed from: c */
    public Iterator f265246c;

    /* JADX INFO: renamed from: d */
    public int f265247d;

    /* JADX INFO: renamed from: e */
    public int f265248e;

    /* JADX INFO: renamed from: f */
    public int f265249f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f265250g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f265251h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f265252i;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Iterator f265253t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr21(int i, int i2, Iterator it, boolean z, boolean z2, fbk fbkVar) {
        super(2, fbkVar);
        this.f265251h = i;
        this.f265252i = i2;
        this.f265253t = it;
        this.f265243X = z;
        this.f265244Y = z2;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        xr21 xr21Var = new xr21(this.f265251h, this.f265252i, this.f265253t, this.f265243X, this.f265244Y, fbkVar);
        xr21Var.f265250g = obj;
        return xr21Var;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        return ((xr21) create((vsz0) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x011f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0121  */
    /* JADX WARN: Code duplicated, block: B:66:0x0136  */
    /* JADX WARN: Code duplicated, block: B:68:0x013c  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0090 A[SYNTHETIC] */
    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        ngx0 ngx0Var;
        Iterator it;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        Iterator it2;
        Object next;
        int i6;
        ngx0 ngx0Var2;
        Object arrayList2;
        Object arrayList3;
        vsz0 vsz0Var = (vsz0) this.f265250g;
        int i7 = this.f265249f;
        boolean z = this.f265244Y;
        boolean z2 = this.f265243X;
        int i8 = this.f265252i;
        int i9 = this.f265251h;
        yuk yukVar = yuk.f276404a;
        if (i7 == 0) {
            bga.m29073P(obj);
            i = i9 <= 1024 ? i9 : 1024;
            i2 = i8 - i9;
            Iterator it3 = this.f265253t;
            if (i2 >= 0) {
                arrayList = new ArrayList(i);
                i3 = i;
                i4 = i2;
                i5 = 0;
                it2 = it3;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i5 > 0) {
                        i5--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i9) {
                            this.f265250g = vsz0Var;
                            this.f265245b = arrayList;
                            this.f265246c = it2;
                            this.f265247d = i3;
                            this.f265248e = i4;
                            this.f265249f = 1;
                            vsz0Var.m86367b(arrayList, this);
                            return yukVar;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f265250g = null;
                    this.f265245b = null;
                    this.f265246c = null;
                    this.f265247d = i3;
                    this.f265248e = i4;
                    this.f265249f = 2;
                    vsz0Var.m86367b(arrayList, this);
                    return yukVar;
                }
            } else {
                ngx0Var = new ngx0(i);
                it = it3;
                while (it.hasNext()) {
                    ngx0Var.m64407b(it.next());
                    if (!ngx0Var.m64409e()) {
                        if (ngx0Var.mo33075a() < i9) {
                            if (z2) {
                                arrayList2 = ngx0Var;
                            } else {
                                arrayList2 = new ArrayList(ngx0Var);
                            }
                            this.f265250g = vsz0Var;
                            this.f265245b = ngx0Var;
                            this.f265246c = it;
                            this.f265247d = i;
                            this.f265248e = i2;
                            this.f265249f = 3;
                            vsz0Var.m86367b(arrayList2, this);
                            return yukVar;
                        }
                        ngx0Var = ngx0Var.m64408d(i9);
                    }
                }
                if (z) {
                    i6 = i;
                    ngx0Var2 = ngx0Var;
                    if (ngx0Var2.mo33075a() > i8) {
                        if (z2) {
                            arrayList3 = ngx0Var2;
                        } else {
                            arrayList3 = new ArrayList(ngx0Var2);
                        }
                        this.f265250g = vsz0Var;
                        this.f265245b = ngx0Var2;
                        this.f265246c = null;
                        this.f265247d = i6;
                        this.f265248e = i2;
                        this.f265249f = 4;
                        vsz0Var.m86367b(arrayList3, this);
                        return yukVar;
                    }
                    if (!ngx0Var2.isEmpty()) {
                        this.f265250g = null;
                        this.f265245b = null;
                        this.f265246c = null;
                        this.f265247d = i6;
                        this.f265248e = i2;
                        this.f265249f = 5;
                        vsz0Var.m86367b(ngx0Var2, this);
                        return yukVar;
                    }
                }
            }
        } else if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    i2 = this.f265248e;
                    int i10 = this.f265247d;
                    it = this.f265246c;
                    ngx0 ngx0Var3 = (ngx0) this.f265245b;
                    bga.m29073P(obj);
                    ngx0Var3.m64410f(i8);
                    i = i10;
                    ngx0Var = ngx0Var3;
                    while (it.hasNext()) {
                        ngx0Var.m64407b(it.next());
                        if (!ngx0Var.m64409e()) {
                            if (ngx0Var.mo33075a() < i9) {
                                if (z2) {
                                    arrayList2 = ngx0Var;
                                } else {
                                    arrayList2 = new ArrayList(ngx0Var);
                                }
                                this.f265250g = vsz0Var;
                                this.f265245b = ngx0Var;
                                this.f265246c = it;
                                this.f265247d = i;
                                this.f265248e = i2;
                                this.f265249f = 3;
                                vsz0Var.m86367b(arrayList2, this);
                                return yukVar;
                            }
                            ngx0Var = ngx0Var.m64408d(i9);
                        }
                    }
                    if (z) {
                        i6 = i;
                        ngx0Var2 = ngx0Var;
                    }
                } else if (i7 == 4) {
                    i2 = this.f265248e;
                    i6 = this.f265247d;
                    ngx0Var2 = (ngx0) this.f265245b;
                    bga.m29073P(obj);
                    ngx0Var2.m64410f(i8);
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                if (ngx0Var2.mo33075a() > i8) {
                    if (z2) {
                        arrayList3 = ngx0Var2;
                    } else {
                        arrayList3 = new ArrayList(ngx0Var2);
                    }
                    this.f265250g = vsz0Var;
                    this.f265245b = ngx0Var2;
                    this.f265246c = null;
                    this.f265247d = i6;
                    this.f265248e = i2;
                    this.f265249f = 4;
                    vsz0Var.m86367b(arrayList3, this);
                    return yukVar;
                }
                if (!ngx0Var2.isEmpty()) {
                    this.f265250g = null;
                    this.f265245b = null;
                    this.f265246c = null;
                    this.f265247d = i6;
                    this.f265248e = i2;
                    this.f265249f = 5;
                    vsz0Var.m86367b(ngx0Var2, this);
                    return yukVar;
                }
            }
            bga.m29073P(obj);
        } else {
            i5 = this.f265248e;
            i3 = this.f265247d;
            it2 = this.f265246c;
            arrayList = (ArrayList) this.f265245b;
            bga.m29073P(obj);
            if (z2) {
                arrayList.clear();
            } else {
                arrayList = new ArrayList(i9);
            }
            i4 = i5;
            while (it2.hasNext()) {
                next = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i9) {
                        this.f265250g = vsz0Var;
                        this.f265245b = arrayList;
                        this.f265246c = it2;
                        this.f265247d = i3;
                        this.f265248e = i4;
                        this.f265249f = 1;
                        vsz0Var.m86367b(arrayList, this);
                        return yukVar;
                    }
                }
            }
            if (!arrayList.isEmpty() && (z || arrayList.size() == i9)) {
                this.f265250g = null;
                this.f265245b = null;
                this.f265246c = null;
                this.f265247d = i3;
                this.f265248e = i4;
                this.f265249f = 2;
                vsz0Var.m86367b(arrayList, this);
                return yukVar;
            }
        }
        return w2a1.f247311a;
    }
}
