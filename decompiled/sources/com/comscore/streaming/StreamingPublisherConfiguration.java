package com.comscore.streaming;

import com.comscore.util.cpp.CppJavaBinder;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class StreamingPublisherConfiguration extends CppJavaBinder {

    /* JADX INFO: renamed from: b */
    private WeakReference<StreamingConfiguration> f1604b;

    /* JADX INFO: renamed from: c */
    private String f1605c;

    public StreamingPublisherConfiguration(StreamingConfiguration streamingConfiguration, String str) {
        this.f1604b = new WeakReference<>(streamingConfiguration);
        this.f1605c = str;
    }

    private native void addLabelsNative(long j, String str, Map<String, String> map);

    private native void removeAllLabelsNative(long j, String str);

    private native void removeLabelNative(long j, String str, String str2);

    private native void setLabelNative(long j, String str, String str2, String str3);

    public void addLabels(Map<String, String> map) {
        try {
            StreamingConfiguration streamingConfiguration = this.f1604b.get();
            if (streamingConfiguration == null) {
                return;
            }
            addLabelsNative(streamingConfiguration.m1395a(), this.f1605c, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    @Override // com.comscore.util.cpp.CppJavaBinder
    public void destroyCppObject() {
    }

    public void removeAllLabels() {
        try {
            StreamingConfiguration streamingConfiguration = this.f1604b.get();
            if (streamingConfiguration == null) {
                return;
            }
            removeAllLabelsNative(streamingConfiguration.m1395a(), this.f1605c);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeLabel(String str) {
        try {
            StreamingConfiguration streamingConfiguration = this.f1604b.get();
            if (streamingConfiguration == null) {
                return;
            }
            removeLabelNative(streamingConfiguration.m1395a(), this.f1605c, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLabel(String str, String str2) {
        try {
            StreamingConfiguration streamingConfiguration = this.f1604b.get();
            if (streamingConfiguration == null) {
                return;
            }
            try {
                setLabelNative(streamingConfiguration.m1395a(), this.f1605c, str, str2);
                return;
            } catch (UnsatisfiedLinkError e) {
                e = e;
            }
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
        }
        printException(e);
    }
}
