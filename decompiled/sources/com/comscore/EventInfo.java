package com.comscore;

import com.comscore.util.cpp.CppJavaBinder;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class EventInfo extends CppJavaBinder {

    /* JADX INFO: renamed from: b */
    private long f1526b;

    public EventInfo() {
        this.f1526b = 0L;
        try {
            this.f1526b = newCppInstanceNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    private static native void addIncludedPublisherNative(long j, String str);

    private static native void addLabelsNative(long j, Map<String, String> map);

    private static native void addPublisherLabelsNative(long j, String str, Map<String, String> map);

    private static native void destroyCppInstanceNative(long j);

    private static native long newCppInstanceNative();

    private static native void setLabelNative(long j, String str, String str2);

    private static native void setPublisherLabelNative(long j, String str, String str2, String str3);

    /* JADX INFO: renamed from: a */
    public long m1206a() {
        return this.f1526b;
    }

    public void addIncludedPublisher(String str) {
        try {
            addIncludedPublisherNative(this.f1526b, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void addLabels(Map<String, String> map) {
        try {
            addLabelsNative(this.f1526b, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void addPublisherLabels(String str, Map<String, String> map) {
        try {
            addPublisherLabelsNative(this.f1526b, str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
        destroyCppInstanceNative(this.f1526b);
    }

    public void setLabel(String str, String str2) {
        try {
            setLabelNative(this.f1526b, str, str2);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPublisherLabel(String str, String str2, String str3) {
        try {
            setPublisherLabelNative(this.f1526b, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
