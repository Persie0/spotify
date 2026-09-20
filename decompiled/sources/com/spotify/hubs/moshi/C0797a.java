package com.spotify.hubs.moshi;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p204p.bk30;
import p204p.dk30;
import p204p.fk30;
import p204p.hk60;
import p204p.it30;
import p204p.mj30;
import p204p.mp91;
import p204p.nt30;
import p204p.p0i0;
import p204p.qk30;
import p204p.rm60;
import p204p.wj30;
import p204p.wq30;
import p204p.xl60;

/* JADX INFO: renamed from: com.spotify.hubs.moshi.a */
/* JADX INFO: loaded from: classes2.dex */
public class C0797a implements hk60.InterfaceC1945e {

    /* JADX INFO: renamed from: a */
    private static final String f4251a = "Hubs model classes do not currently support serialization to JSON";

    /* JADX INFO: renamed from: com.spotify.hubs.moshi.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4252a;

        static {
            int[] iArr = new int[xl60.EnumC2579c.values().length];
            f4252a = iArr;
            try {
                iArr[xl60.EnumC2579c.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4252a[xl60.EnumC2579c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4252a[xl60.EnumC2579c.BEGIN_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.spotify.hubs.moshi.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    public static class b extends hk60<mj30> {

        /* JADX INFO: renamed from: a */
        private final p0i0 f4253a;

        public b(p0i0 p0i0Var) {
            this.f4253a = p0i0Var;
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public mj30 fromJson(xl60 xl60Var) {
            HubsJsonCommandModel hubsJsonCommandModel = (HubsJsonCommandModel) this.f4253a.m68703c(HubsJsonCommandModel.class).fromJson(xl60Var);
            hubsJsonCommandModel.getClass();
            return hubsJsonCommandModel.m11897a();
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, mj30 mj30Var) throws IOException {
            throw new IOException(C0797a.f4251a);
        }
    }

    /* JADX INFO: renamed from: com.spotify.hubs.moshi.a$c */
    /* JADX INFO: loaded from: classes7.dex */
    public static class c extends hk60<wj30> {

        /* JADX INFO: renamed from: a */
        private final p0i0 f4254a;

        public c(p0i0 p0i0Var) {
            this.f4254a = p0i0Var;
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public wj30 fromJson(xl60 xl60Var) {
            return HubsImmutableComponentBundle.fromNullable((wj30) this.f4254a.m68703c(HubsImmutableComponentBundle.class).fromJson(xl60Var));
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, wj30 wj30Var) throws IOException {
            throw new IOException(C0797a.f4251a);
        }
    }

    /* JADX INFO: renamed from: com.spotify.hubs.moshi.a$d */
    /* JADX INFO: loaded from: classes7.dex */
    public static class d extends hk60<bk30> {

        /* JADX INFO: renamed from: a */
        private final p0i0 f4255a;

        public d(p0i0 p0i0Var) {
            this.f4255a = p0i0Var;
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public bk30 fromJson(xl60 xl60Var) {
            HubsJsonComponentIdentifier hubsJsonComponentIdentifier = (HubsJsonComponentIdentifier) this.f4255a.m68703c(HubsJsonComponentIdentifier.class).fromJson(xl60Var);
            hubsJsonComponentIdentifier.getClass();
            return hubsJsonComponentIdentifier.m11901a();
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, bk30 bk30Var) throws IOException {
            throw new IOException(C0797a.f4251a);
        }
    }

    /* JADX INFO: renamed from: com.spotify.hubs.moshi.a$e */
    /* JADX INFO: loaded from: classes7.dex */
    public static class e extends hk60<dk30> {

        /* JADX INFO: renamed from: a */
        private final p0i0 f4256a;

        public e(p0i0 p0i0Var) {
            this.f4256a = p0i0Var;
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public dk30 fromJson(xl60 xl60Var) {
            HubsJsonComponentImages hubsJsonComponentImages = (HubsJsonComponentImages) this.f4256a.m68703c(HubsJsonComponentImages.class).fromJson(xl60Var);
            hubsJsonComponentImages.getClass();
            return hubsJsonComponentImages.m11902a();
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, dk30 dk30Var) throws IOException {
            throw new IOException(C0797a.f4251a);
        }
    }

    /* JADX INFO: renamed from: com.spotify.hubs.moshi.a$f */
    /* JADX INFO: loaded from: classes7.dex */
    public static class f extends hk60<fk30> {

        /* JADX INFO: renamed from: a */
        private final p0i0 f4257a;

        public f(p0i0 p0i0Var) {
            this.f4257a = p0i0Var;
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public fk30 fromJson(xl60 xl60Var) {
            HubsJsonComponentModel hubsJsonComponentModel = (HubsJsonComponentModel) this.f4257a.m68703c(HubsJsonComponentModel.class).fromJson(xl60Var);
            hubsJsonComponentModel.getClass();
            return hubsJsonComponentModel.m11903a();
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, fk30 fk30Var) throws IOException {
            throw new IOException(C0797a.f4251a);
        }
    }

    /* JADX INFO: renamed from: com.spotify.hubs.moshi.a$g */
    /* JADX INFO: loaded from: classes7.dex */
    public static class g extends hk60<qk30> {

        /* JADX INFO: renamed from: a */
        private final p0i0 f4258a;

        public g(p0i0 p0i0Var) {
            this.f4258a = p0i0Var;
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public qk30 fromJson(xl60 xl60Var) {
            HubsJsonComponentText hubsJsonComponentText = (HubsJsonComponentText) this.f4258a.m68703c(HubsJsonComponentText.class).fromJson(xl60Var);
            hubsJsonComponentText.getClass();
            return hubsJsonComponentText.m11904a();
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, qk30 qk30Var) throws IOException {
            throw new IOException(C0797a.f4251a);
        }
    }

    /* JADX INFO: renamed from: com.spotify.hubs.moshi.a$h */
    /* JADX INFO: loaded from: classes7.dex */
    public static class h extends hk60<wq30> {

        /* JADX INFO: renamed from: a */
        private final p0i0 f4259a;

        public h(p0i0 p0i0Var) {
            this.f4259a = p0i0Var;
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public wq30 fromJson(xl60 xl60Var) {
            HubsJsonImage hubsJsonImage = (HubsJsonImage) this.f4259a.m68703c(HubsJsonImage.class).fromJson(xl60Var);
            hubsJsonImage.getClass();
            return hubsJsonImage.m11905a();
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, wq30 wq30Var) throws IOException {
            throw new IOException(C0797a.f4251a);
        }
    }

    /* JADX INFO: renamed from: com.spotify.hubs.moshi.a$i */
    /* JADX INFO: loaded from: classes7.dex */
    public static class i extends hk60<HubsImmutableComponentBundle> {

        /* JADX INFO: renamed from: a */
        private final p0i0 f4260a;

        public i(p0i0 p0i0Var) {
            this.f4260a = p0i0Var;
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HubsImmutableComponentBundle fromJson(xl60 xl60Var) {
            if (xl60Var.mo51068B() == xl60.EnumC2579c.NULL) {
                return null;
            }
            Map map = (Map) this.f4260a.m68704d(mp91.m62457j(Map.class, String.class, Object.class)).fromJson(xl60Var.mo51069D());
            map.getClass();
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            linkedList.push(map);
            xl60Var.mo51076c();
            while (true) {
                if (xl60Var.mo51079i()) {
                    String strMo51084s = xl60Var.mo51084s();
                    int i = a.f4252a[xl60Var.mo51068B().ordinal()];
                    if (i == 1) {
                        String strMo51087y = xl60Var.mo51087y();
                        if (strMo51087y != null && !strMo51087y.contains(".")) {
                            ((Map) linkedList.peek()).put(strMo51084s, Long.valueOf(Long.parseLong(strMo51087y)));
                        }
                    } else if (i == 2) {
                        xl60Var.mo51076c();
                        linkedList.push((Map) ((Map) linkedList.peek()).get(strMo51084s));
                    } else if (i != 3) {
                        xl60Var.mo51074Q();
                    } else {
                        xl60Var.mo51075a();
                        linkedList2.push((List) ((Map) linkedList.peek()).get(strMo51084s));
                        int i2 = 0;
                        while (xl60Var.mo51079i()) {
                            if (xl60Var.mo51068B() == xl60.EnumC2579c.NUMBER) {
                                String strMo51087y2 = xl60Var.mo51087y();
                                if (strMo51087y2 != null && !strMo51087y2.contains(".")) {
                                    ((List) linkedList2.peek()).set(i2, Long.valueOf(Long.parseLong(strMo51087y2)));
                                }
                            } else {
                                xl60Var.mo51074Q();
                            }
                            i2++;
                        }
                        linkedList2.pop();
                        xl60Var.mo51077e();
                    }
                } else {
                    linkedList.pop();
                    xl60Var.mo51078f();
                    if (linkedList.isEmpty()) {
                        return (HubsImmutableComponentBundle) new HubsJsonComponentBundle(map).m11900c();
                    }
                }
            }
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, HubsImmutableComponentBundle hubsImmutableComponentBundle) throws IOException {
            throw new IOException(C0797a.f4251a);
        }
    }

    /* JADX INFO: renamed from: com.spotify.hubs.moshi.a$j */
    /* JADX INFO: loaded from: classes7.dex */
    public static class j extends hk60<it30> {

        /* JADX INFO: renamed from: a */
        private final p0i0 f4261a;

        public j(p0i0 p0i0Var) {
            this.f4261a = p0i0Var;
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public it30 fromJson(xl60 xl60Var) {
            HubsJsonTarget hubsJsonTarget = (HubsJsonTarget) this.f4261a.m68703c(HubsJsonTarget.class).fromJson(xl60Var);
            hubsJsonTarget.getClass();
            return hubsJsonTarget.m11907a();
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, it30 it30Var) throws IOException {
            throw new IOException(C0797a.f4251a);
        }
    }

    /* JADX INFO: renamed from: com.spotify.hubs.moshi.a$k */
    /* JADX INFO: loaded from: classes7.dex */
    public static class k extends hk60<nt30> {

        /* JADX INFO: renamed from: a */
        private final p0i0 f4262a;

        public k(p0i0 p0i0Var) {
            this.f4262a = p0i0Var;
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public nt30 fromJson(xl60 xl60Var) {
            HubsJsonViewModel hubsJsonViewModel = (HubsJsonViewModel) this.f4262a.m68703c(HubsJsonViewModel.class).fromJson(xl60Var);
            hubsJsonViewModel.getClass();
            return hubsJsonViewModel.m11908a();
        }

        @Override // p204p.hk60
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void toJson(rm60 rm60Var, nt30 nt30Var) throws IOException {
            throw new IOException(C0797a.f4251a);
        }
    }

    @Override // p204p.hk60.InterfaceC1945e
    public hk60<?> create(Type type, Set<? extends Annotation> set, p0i0 p0i0Var) {
        hk60 eVar;
        Class<?> clsM62454g = mp91.m62454g(type);
        if (mj30.class.isAssignableFrom(clsM62454g)) {
            eVar = new b(p0i0Var);
        } else if (HubsImmutableComponentBundle.class.isAssignableFrom(clsM62454g)) {
            eVar = new i(p0i0Var);
        } else if (wj30.class.isAssignableFrom(clsM62454g)) {
            eVar = new c(p0i0Var);
        } else if (wq30.class.isAssignableFrom(clsM62454g)) {
            eVar = new h(p0i0Var);
        } else if (it30.class.isAssignableFrom(clsM62454g)) {
            eVar = new j(p0i0Var);
        } else if (nt30.class.isAssignableFrom(clsM62454g)) {
            eVar = new k(p0i0Var);
        } else if (fk30.class.isAssignableFrom(clsM62454g)) {
            eVar = new f(p0i0Var);
        } else if (qk30.class.isAssignableFrom(clsM62454g)) {
            eVar = new g(p0i0Var);
        } else if (bk30.class.isAssignableFrom(clsM62454g)) {
            eVar = new d(p0i0Var);
        } else {
            eVar = dk30.class.isAssignableFrom(clsM62454g) ? new e(p0i0Var) : null;
        }
        if (eVar == null) {
            return null;
        }
        return eVar.nullSafe();
    }
}
