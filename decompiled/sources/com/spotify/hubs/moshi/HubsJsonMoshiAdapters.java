package com.spotify.hubs.moshi;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p204p.be00;
import p204p.bk30;
import p204p.dk30;
import p204p.fk30;
import p204p.it30;
import p204p.jx71;
import p204p.mj30;
import p204p.mp91;
import p204p.nt30;
import p204p.p0i0;
import p204p.qk30;
import p204p.rm60;
import p204p.wj30;
import p204p.wq30;
import p204p.xl60;

/* JADX INFO: loaded from: classes7.dex */
public final class HubsJsonMoshiAdapters {

    /* JADX INFO: renamed from: a */
    private static final String f4230a = "Hubs model classes do not currently support serialization to JSON";

    /* JADX INFO: renamed from: b */
    public static final HubsJsonMoshiAdapters f4231b = new HubsJsonMoshiAdapters();

    /* JADX INFO: renamed from: com.spotify.hubs.moshi.HubsJsonMoshiAdapters$a */
    public static /* synthetic */ class C0796a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f4232a;

        static {
            int[] iArr = new int[xl60.EnumC2579c.values().length];
            f4232a = iArr;
            try {
                iArr[xl60.EnumC2579c.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4232a[xl60.EnumC2579c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4232a[xl60.EnumC2579c.BEGIN_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static p0i0 m11906a() {
        return new p0i0.C2237b().m68709a(f4231b).m68713e();
    }

    @be00
    public mj30 fromJsonHubsCommandModel(xl60 xl60Var) {
        HubsJsonCommandModel hubsJsonCommandModel = (HubsJsonCommandModel) m11906a().m68703c(HubsJsonCommandModel.class).fromJson(xl60Var);
        hubsJsonCommandModel.getClass();
        return hubsJsonCommandModel.m11897a();
    }

    @be00
    public wj30 fromJsonHubsComponentBundle(xl60 xl60Var) {
        return HubsImmutableComponentBundle.fromNullable(fromJsonHubsImmutableComponentBundle(xl60Var));
    }

    @be00
    public bk30 fromJsonHubsComponentIdentifier(xl60 xl60Var) {
        HubsJsonComponentIdentifier hubsJsonComponentIdentifier = (HubsJsonComponentIdentifier) m11906a().m68703c(HubsJsonComponentIdentifier.class).fromJson(xl60Var);
        hubsJsonComponentIdentifier.getClass();
        return hubsJsonComponentIdentifier.m11901a();
    }

    @be00
    public dk30 fromJsonHubsComponentImages(xl60 xl60Var) {
        HubsJsonComponentImages hubsJsonComponentImages = (HubsJsonComponentImages) m11906a().m68703c(HubsJsonComponentImages.class).fromJson(xl60Var);
        hubsJsonComponentImages.getClass();
        return hubsJsonComponentImages.m11902a();
    }

    @be00
    public fk30 fromJsonHubsComponentModel(xl60 xl60Var) {
        HubsJsonComponentModel hubsJsonComponentModel = (HubsJsonComponentModel) m11906a().m68703c(HubsJsonComponentModel.class).fromJson(xl60Var);
        hubsJsonComponentModel.getClass();
        return hubsJsonComponentModel.m11903a();
    }

    @be00
    public qk30 fromJsonHubsComponentText(xl60 xl60Var) {
        HubsJsonComponentText hubsJsonComponentText = (HubsJsonComponentText) m11906a().m68703c(HubsJsonComponentText.class).fromJson(xl60Var);
        hubsJsonComponentText.getClass();
        return hubsJsonComponentText.m11904a();
    }

    @be00
    public wq30 fromJsonHubsImage(xl60 xl60Var) {
        HubsJsonImage hubsJsonImage = (HubsJsonImage) m11906a().m68703c(HubsJsonImage.class).fromJson(xl60Var);
        hubsJsonImage.getClass();
        return hubsJsonImage.m11905a();
    }

    @be00
    public HubsImmutableComponentBundle fromJsonHubsImmutableComponentBundle(xl60 xl60Var) {
        if (xl60Var.mo51068B() == xl60.EnumC2579c.NULL) {
            return null;
        }
        Map map = (Map) m11906a().m68704d(mp91.m62457j(Map.class, String.class, Object.class)).fromJson(xl60Var.mo51069D());
        map.getClass();
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        linkedList.push(map);
        xl60Var.mo51076c();
        while (true) {
            if (xl60Var.mo51079i()) {
                String strMo51084s = xl60Var.mo51084s();
                int i = C0796a.f4232a[xl60Var.mo51068B().ordinal()];
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

    @be00
    public it30 fromJsonHubsTarget(xl60 xl60Var) {
        HubsJsonTarget hubsJsonTarget = (HubsJsonTarget) m11906a().m68703c(HubsJsonTarget.class).fromJson(xl60Var);
        hubsJsonTarget.getClass();
        return hubsJsonTarget.m11907a();
    }

    @be00
    public nt30 fromJsonHubsViewModel(xl60 xl60Var) {
        HubsJsonViewModel hubsJsonViewModel = (HubsJsonViewModel) m11906a().m68703c(HubsJsonViewModel.class).fromJson(xl60Var);
        hubsJsonViewModel.getClass();
        return hubsJsonViewModel.m11908a();
    }

    @jx71
    public void toJsonHubsCommandModel(rm60 rm60Var, mj30 mj30Var) throws IOException {
        throw new IOException(f4230a);
    }

    @jx71
    public void toJsonHubsComponentBundle(rm60 rm60Var, wj30 wj30Var) throws IOException {
        throw new IOException(f4230a);
    }

    @jx71
    public void toJsonHubsComponentIdentifier(rm60 rm60Var, bk30 bk30Var) throws IOException {
        throw new IOException(f4230a);
    }

    @jx71
    public void toJsonHubsComponentImages(rm60 rm60Var, dk30 dk30Var) throws IOException {
        throw new IOException(f4230a);
    }

    @jx71
    public void toJsonHubsComponentModel(rm60 rm60Var, fk30 fk30Var) throws IOException {
        throw new IOException(f4230a);
    }

    @jx71
    public void toJsonHubsComponentText(rm60 rm60Var, qk30 qk30Var) throws IOException {
        throw new IOException(f4230a);
    }

    @jx71
    public void toJsonHubsImage(rm60 rm60Var, wq30 wq30Var) throws IOException {
        throw new IOException(f4230a);
    }

    @jx71
    public void toJsonHubsImmutableComponentBundle(rm60 rm60Var, HubsImmutableComponentBundle hubsImmutableComponentBundle) throws IOException {
        throw new IOException(f4230a);
    }

    @jx71
    public void toJsonHubsTarget(rm60 rm60Var, it30 it30Var) throws IOException {
        throw new IOException(f4230a);
    }

    @jx71
    public void toJsonHubsViewModel(rm60 rm60Var, nt30 nt30Var) throws IOException {
        throw new IOException(f4230a);
    }
}
