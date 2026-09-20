package p196j$.desugar.sun.nio.p197fs;

import java.nio.file.CopyOption;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p196j$.nio.file.AbstractC1476h0;
import p196j$.nio.file.C1463b;
import p196j$.nio.file.C1465c;
import p196j$.nio.file.C1478i0;
import p196j$.nio.file.C1480j0;
import p196j$.nio.file.C1493s;
import p196j$.nio.file.C1497t;
import p196j$.nio.file.C1500w;
import p196j$.nio.file.C1501x;
import p196j$.nio.file.EnumC1472f0;
import p196j$.nio.file.InterfaceC1482k0;
import p196j$.nio.file.InterfaceC1498u;
import p196j$.nio.file.LinkOption;
import p196j$.nio.file.Path;
import p196j$.nio.file.StandardCopyOption;
import p196j$.nio.file.attribute.C1434a;
import p196j$.nio.file.attribute.C1443g;
import p196j$.nio.file.attribute.C1444h;
import p196j$.nio.file.attribute.C1445i;
import p196j$.nio.file.attribute.C1446j;
import p196j$.nio.file.attribute.C1448l;
import p196j$.nio.file.attribute.C1457u;
import p196j$.nio.file.attribute.C1458v;
import p196j$.nio.file.attribute.C1460x;
import p196j$.nio.file.attribute.EnumC1459w;
import p196j$.nio.file.attribute.FileTime;
import p196j$.nio.file.attribute.InterfaceC1440d;
import p196j$.nio.file.attribute.InterfaceC1447k;
import p196j$.nio.file.attribute.InterfaceC1454r;
import p196j$.time.C1510a;
import p196j$.time.ZoneId;
import p196j$.util.C1625a;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.g */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC1419g {
    /* JADX INFO: renamed from: a */
    public static FileTime m23818a(java.nio.file.attribute.FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        long millis = fileTime.toMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return new FileTime(millis);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ StandardOpenOption m23819b(EnumC1472f0 enumC1472f0) {
        if (enumC1472f0 == null) {
            return null;
        }
        if (enumC1472f0 == EnumC1472f0.READ) {
            return StandardOpenOption.READ;
        }
        if (enumC1472f0 == EnumC1472f0.WRITE) {
            return StandardOpenOption.WRITE;
        }
        if (enumC1472f0 == EnumC1472f0.APPEND) {
            return StandardOpenOption.APPEND;
        }
        if (enumC1472f0 == EnumC1472f0.TRUNCATE_EXISTING) {
            return StandardOpenOption.TRUNCATE_EXISTING;
        }
        if (enumC1472f0 == EnumC1472f0.CREATE) {
            return StandardOpenOption.CREATE;
        }
        if (enumC1472f0 == EnumC1472f0.CREATE_NEW) {
            return StandardOpenOption.CREATE_NEW;
        }
        if (enumC1472f0 == EnumC1472f0.DELETE_ON_CLOSE) {
            return StandardOpenOption.DELETE_ON_CLOSE;
        }
        if (enumC1472f0 == EnumC1472f0.SPARSE) {
            return StandardOpenOption.SPARSE;
        }
        return enumC1472f0 == EnumC1472f0.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    /* JADX INFO: renamed from: c */
    public static java.nio.file.attribute.FileTime m23820c(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return java.nio.file.attribute.FileTime.fromMillis(fileTime.toMillis());
    }

    /* JADX INFO: renamed from: d */
    public static Object m23821d(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Path) {
            return C1501x.m23932r((Path) obj);
        }
        return obj instanceof java.nio.file.Path ? C1500w.m23931r((java.nio.file.Path) obj) : obj;
    }

    /* JADX INFO: renamed from: e */
    public static Class m23822e(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributeView.class) {
            return InterfaceC1440d.class;
        }
        if (cls == InterfaceC1440d.class) {
            return BasicFileAttributeView.class;
        }
        if (cls == PosixFileAttributeView.class) {
            return C1457u.class;
        }
        if (cls == C1457u.class) {
            return PosixFileAttributeView.class;
        }
        if (cls == FileOwnerAttributeView.class) {
            return InterfaceC1454r.class;
        }
        if (cls == InterfaceC1454r.class) {
            return FileOwnerAttributeView.class;
        }
        if (cls == C1443g.class) {
            return DosFileAttributeView.class;
        }
        if (cls == DosFileAttributeView.class) {
            return C1443g.class;
        }
        if (cls == C1460x.class) {
            return UserDefinedFileAttributeView.class;
        }
        if (cls == UserDefinedFileAttributeView.class) {
            return C1460x.class;
        }
        if (cls == C1434a.class) {
            return AclFileAttributeView.class;
        }
        if (cls == AclFileAttributeView.class) {
            return C1434a.class;
        }
        C1625a.m24209a("java.nio.file.attribute.FileAttributeView", cls);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static Class m23823f(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributes.class) {
            return p196j$.nio.file.attribute.BasicFileAttributes.class;
        }
        if (cls == p196j$.nio.file.attribute.BasicFileAttributes.class) {
            return BasicFileAttributes.class;
        }
        if (cls == PosixFileAttributes.class) {
            return C1458v.class;
        }
        if (cls == C1458v.class) {
            return PosixFileAttributes.class;
        }
        if (cls == C1444h.class) {
            return DosFileAttributes.class;
        }
        if (cls == DosFileAttributes.class) {
            return C1444h.class;
        }
        C1625a.m24209a("java.nio.file.attribute.BasicFileAttributes", cls);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public static Map m23824g(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, m23825h(map.get(str)));
        }
        return map2;
    }

    /* JADX INFO: renamed from: h */
    public static Object m23825h(Object obj) {
        if (obj instanceof java.nio.file.attribute.FileTime) {
            try {
                return m23818a((java.nio.file.attribute.FileTime) obj);
            } catch (ClassCastException e) {
                C1625a.m24209a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (!(obj instanceof FileTime)) {
            return obj;
        }
        try {
            return m23820c((FileTime) obj);
        } catch (ClassCastException e2) {
            C1625a.m24209a("java.nio.file.attribute.FileTime", e2);
            throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static Set m23826i(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof InterfaceC1498u) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(C1497t.m23930a((InterfaceC1498u) it.next()));
                } catch (ClassCastException e) {
                    C1625a.m24209a("java.nio.file.OpenOption", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof OpenOption)) {
                C1625a.m24209a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(C1493s.m23926a((OpenOption) it2.next()));
                } catch (ClassCastException e2) {
                    C1625a.m24209a("java.nio.file.OpenOption", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: j */
    public static Set m23827j(Set set) {
        EnumC1459w enumC1459w;
        PosixFilePermission posixFilePermission;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC1459w) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC1459w enumC1459w2 = (EnumC1459w) it.next();
                    if (enumC1459w2 == null) {
                        posixFilePermission = null;
                    } else if (enumC1459w2 == EnumC1459w.OWNER_READ) {
                        posixFilePermission = PosixFilePermission.OWNER_READ;
                    } else if (enumC1459w2 == EnumC1459w.OWNER_WRITE) {
                        posixFilePermission = PosixFilePermission.OWNER_WRITE;
                    } else if (enumC1459w2 == EnumC1459w.OWNER_EXECUTE) {
                        posixFilePermission = PosixFilePermission.OWNER_EXECUTE;
                    } else if (enumC1459w2 == EnumC1459w.GROUP_READ) {
                        posixFilePermission = PosixFilePermission.GROUP_READ;
                    } else if (enumC1459w2 == EnumC1459w.GROUP_WRITE) {
                        posixFilePermission = PosixFilePermission.GROUP_WRITE;
                    } else if (enumC1459w2 == EnumC1459w.GROUP_EXECUTE) {
                        posixFilePermission = PosixFilePermission.GROUP_EXECUTE;
                    } else if (enumC1459w2 == EnumC1459w.OTHERS_READ) {
                        posixFilePermission = PosixFilePermission.OTHERS_READ;
                    } else {
                        posixFilePermission = enumC1459w2 == EnumC1459w.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE;
                    }
                    hashSet.add(posixFilePermission);
                } catch (ClassCastException e) {
                    C1625a.m24209a("java.nio.file.attribute.PosixFilePermission", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof PosixFilePermission)) {
                C1625a.m24209a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    PosixFilePermission posixFilePermission2 = (PosixFilePermission) it2.next();
                    if (posixFilePermission2 == null) {
                        enumC1459w = null;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_READ) {
                        enumC1459w = EnumC1459w.OWNER_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_WRITE) {
                        enumC1459w = EnumC1459w.OWNER_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.OWNER_EXECUTE) {
                        enumC1459w = EnumC1459w.OWNER_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_READ) {
                        enumC1459w = EnumC1459w.GROUP_READ;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_WRITE) {
                        enumC1459w = EnumC1459w.GROUP_WRITE;
                    } else if (posixFilePermission2 == PosixFilePermission.GROUP_EXECUTE) {
                        enumC1459w = EnumC1459w.GROUP_EXECUTE;
                    } else if (posixFilePermission2 == PosixFilePermission.OTHERS_READ) {
                        enumC1459w = EnumC1459w.OTHERS_READ;
                    } else {
                        enumC1459w = posixFilePermission2 == PosixFilePermission.OTHERS_WRITE ? EnumC1459w.OTHERS_WRITE : EnumC1459w.OTHERS_EXECUTE;
                    }
                    hashSet.add(enumC1459w);
                } catch (ClassCastException e2) {
                    C1625a.m24209a("java.nio.file.attribute.PosixFilePermission", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m23828k(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.isEmpty()) {
            return false;
        }
        Object next = set.iterator().next();
        return (next instanceof EnumC1459w) || (next instanceof PosixFilePermission);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ String m23829l(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ List m23830m(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Set m23831n(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ LinkOption[] m23832o(java.nio.file.LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        LinkOption[] linkOptionArr2 = new LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    /* JADX INFO: renamed from: p */
    public static InterfaceC1482k0[] m23833p(WatchEvent.Kind[] kindArr) {
        InterfaceC1482k0 c1478i0;
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        InterfaceC1482k0[] interfaceC1482k0Arr = new InterfaceC1482k0[length];
        for (int i = 0; i < length; i++) {
            WatchEvent.Kind kind = kindArr[i];
            if (kind == null) {
                c1478i0 = null;
            } else if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
                c1478i0 = AbstractC1476h0.f10557b;
            } else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
                c1478i0 = AbstractC1476h0.f10558c;
            } else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
                c1478i0 = AbstractC1476h0.f10559d;
            } else if (kind == StandardWatchEventKinds.OVERFLOW) {
                c1478i0 = AbstractC1476h0.f10556a;
            } else {
                c1478i0 = kind instanceof C1480j0 ? ((C1480j0) kind).f10562a : new C1478i0(kind);
            }
            interfaceC1482k0Arr[i] = c1478i0;
        }
        return interfaceC1482k0Arr;
    }

    /* JADX INFO: renamed from: q */
    public static InterfaceC1447k[] m23834q(FileAttribute[] fileAttributeArr) {
        InterfaceC1447k c1445i;
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        InterfaceC1447k[] interfaceC1447kArr = new InterfaceC1447k[length];
        for (int i = 0; i < length; i++) {
            FileAttribute fileAttribute = fileAttributeArr[i];
            if (fileAttribute == null) {
                c1445i = null;
            } else if (m23828k(fileAttribute.value())) {
                c1445i = new C1420h(fileAttribute);
            } else {
                c1445i = fileAttribute instanceof C1446j ? ((C1446j) fileAttribute).f10529a : new C1445i(fileAttribute);
            }
            interfaceC1447kArr[i] = c1445i;
        }
        return interfaceC1447kArr;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ CopyOption[] m23835r(p196j$.nio.file.CopyOption[] copyOptionArr) {
        CopyOption c1465c;
        if (copyOptionArr == null) {
            return null;
        }
        int length = copyOptionArr.length;
        CopyOption[] copyOptionArr2 = new CopyOption[length];
        for (int i = 0; i < length; i++) {
            p196j$.nio.file.CopyOption copyOption = copyOptionArr[i];
            if (copyOption == null) {
                c1465c = null;
            } else if (copyOption instanceof C1463b) {
                c1465c = ((C1463b) copyOption).f10543a;
            } else if (copyOption instanceof LinkOption) {
                c1465c = java.nio.file.LinkOption.NOFOLLOW_LINKS;
            } else if (copyOption instanceof StandardCopyOption) {
                StandardCopyOption standardCopyOption = (StandardCopyOption) copyOption;
                c1465c = standardCopyOption == StandardCopyOption.REPLACE_EXISTING ? java.nio.file.StandardCopyOption.REPLACE_EXISTING : standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES ? java.nio.file.StandardCopyOption.COPY_ATTRIBUTES : java.nio.file.StandardCopyOption.ATOMIC_MOVE;
            } else {
                c1465c = new C1465c(copyOption);
            }
            copyOptionArr2[i] = c1465c;
        }
        return copyOptionArr2;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ java.nio.file.LinkOption[] m23836s(LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        java.nio.file.LinkOption[] linkOptionArr2 = new java.nio.file.LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : java.nio.file.LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    /* JADX INFO: renamed from: t */
    public static WatchEvent.Kind[] m23837t(InterfaceC1482k0[] interfaceC1482k0Arr) {
        WatchEvent.Kind c1480j0;
        if (interfaceC1482k0Arr == null) {
            return null;
        }
        int length = interfaceC1482k0Arr.length;
        WatchEvent.Kind[] kindArr = new WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            InterfaceC1482k0 interfaceC1482k0 = interfaceC1482k0Arr[i];
            if (interfaceC1482k0 == null) {
                c1480j0 = null;
            } else if (interfaceC1482k0 == AbstractC1476h0.f10557b) {
                c1480j0 = StandardWatchEventKinds.ENTRY_CREATE;
            } else if (interfaceC1482k0 == AbstractC1476h0.f10558c) {
                c1480j0 = StandardWatchEventKinds.ENTRY_DELETE;
            } else if (interfaceC1482k0 == AbstractC1476h0.f10559d) {
                c1480j0 = StandardWatchEventKinds.ENTRY_MODIFY;
            } else if (interfaceC1482k0 == AbstractC1476h0.f10556a) {
                c1480j0 = StandardWatchEventKinds.OVERFLOW;
            } else {
                c1480j0 = interfaceC1482k0 instanceof C1478i0 ? ((C1478i0) interfaceC1482k0).f10560a : new C1480j0(interfaceC1482k0);
            }
            kindArr[i] = c1480j0;
        }
        return kindArr;
    }

    /* JADX INFO: renamed from: u */
    public static FileAttribute[] m23838u(InterfaceC1447k[] interfaceC1447kArr) {
        FileAttribute c1446j;
        if (interfaceC1447kArr == null) {
            return null;
        }
        int length = interfaceC1447kArr.length;
        FileAttribute[] fileAttributeArr = new FileAttribute[length];
        for (int i = 0; i < length; i++) {
            InterfaceC1447k interfaceC1447k = interfaceC1447kArr[i];
            if (interfaceC1447k == null) {
                c1446j = null;
            } else if (m23828k(interfaceC1447k.value())) {
                c1446j = new C1448l(interfaceC1447k);
            } else {
                c1446j = interfaceC1447k instanceof C1445i ? ((C1445i) interfaceC1447k).f10528a : new C1446j(interfaceC1447k);
            }
            fileAttributeArr[i] = c1446j;
        }
        return fileAttributeArr;
    }

    /* JADX INFO: renamed from: v */
    public static char m23839v(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: w */
    public static C1510a m23840w() {
        String id = TimeZone.getDefault().getID();
        Map map = ZoneId.f10620a;
        Objects.requireNonNull(id, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        String str = (String) map.get(id);
        if (str != null) {
            id = str;
        }
        return new C1510a(ZoneId.m23969E(id, true));
    }
}
